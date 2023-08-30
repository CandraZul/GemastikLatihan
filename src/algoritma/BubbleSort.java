/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritma;

import java.util.Arrays;

/**
 *
 * @author candr
 */
public class BubbleSort {
    public int[] Ascending(int[] number){
        for (int i=0;i<number.length-1;i++){
            for (int j=0;j<number.length-i-1;j++){
                if (number[j]>number[j+1]){
                    int num = number[j];
                    number[j] = number[j+1];
                    number[j+1] = num;
                }
            }
        }
    return number;
    }
    
    public int[] Descending(int[] number){
        for (int i=0;i<number.length-1;i++){
            for (int j=0;j<number.length-i-1;j++){
                if (number[j]<number[j+1]){
                    int num = number[j];
                    number[j] = number[j+1];
                    number[j+1] = num;
                }
            }
       }
    return number;
    }
    
    public static void main(String[] args) {
        int[] A = {5,4,5,2,1};
//        BubbleSort H = new BubbleSort();
//        H.Descending(A);
//        System.out.println(Arrays.toString(A));

          SelectionSort H = new SelectionSort();
          H.Descending(A);
          System.out.println(Arrays.toString(A));
        
    }
}
