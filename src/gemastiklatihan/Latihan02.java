/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;
import java.util.Scanner;
/**
 *
 * @author candr
 */
public class Latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        do{
            N = input.nextInt();
            input.nextLine();
        }while(N<2||N>1000);
        
        int[] x = new int[N];
        String[] x2 = input.nextLine().split(" ");
        for(int i=0;i<x2.length;i++){
            x[i] = Integer.parseInt(x2[i]);
        }
        
        for (int i:x){
            System.out.println(x[i]);
        }
    }
    
    
}
