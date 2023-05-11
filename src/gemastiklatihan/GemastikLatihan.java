/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gemastiklatihan;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class GemastikLatihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner input = new Scanner(System.in);
        int p;
        
        do {
            p = input.nextInt();
            input.nextLine();
        }while(p<1||p>100);
        
        String[] dataDesa = new String[p];
        int[] jarak = new int[p];
        
        for (int i = 0; i < p; i++){
            double r;
            double r2;
            double x;
            double x2;
            double y;
            double y2;
            do{
                String[] Desa = input.nextLine().split(" ");
                dataDesa[i]=Desa[0]+" "+Desa[4];
                x = Double.parseDouble(Desa[1]);
                y = Double.parseDouble(Desa[2]);
                r = Double.parseDouble(Desa[3]);
                x2 = Double.parseDouble(Desa[5]);
                y2 = Double.parseDouble(Desa[6]);
                r2 = Double.parseDouble(Desa[7]);
            }while(x<0||x>100000||y<0||y>100000||r<0||r>100000||x2<0||x2>100000||y2<0||y2>100000||r2<0||r2>100000);
            
            jarak[i]=jarakDesa(x, y, r, x2, y2, r2);
        }
        
        sorting(jarak, dataDesa);
        
        for (int i=0; i<p;i++){
            System.out.println(dataDesa[i] +" "+ jarak[i]);
        }
        
    }
     
    static int jarakDesa(double x, double y, double r, double x2, double y2, double r2){
        double jarak = Math.sqrt((Math.pow((x-x2),2) + Math.pow((y-y2), 2)));
        int jarak2 = (int) Math.floor(jarak);
        return jarak2;
    }
    
    static void sorting(int[] x, String[] y){
        for (int i=0;i<x.length-1;i++){
            for (int j=0;j<x.length-i-1;j++){
                if (x[j] < x[j+1]){
                    //swap jarak
                    int swap = x[j];
                    x[j]=x[j+1];
                    x[j+1]=swap;
                    //swap nama desa
                    String tukar = y[j];
                    y[j]=y[j+1];
                    y[j+1]=tukar;
                    
                }
            }
        }
    }
    
}
