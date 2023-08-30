/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritma;

/**
 *
 * @author candr
 */
public class SelectionSort {
    int[] Ascending (int[] number){
        for (int i=0;i<number.length-1;i++){
            int min = i;
            for (int j=i+1;j<number.length;j++){
                if (number[j] < number[min]){
                    min = j;
                }
            }
            int num = number[i];
            number[i] = number[min];
            number[min] = num;
        }
        return number;
    }
    
        int[] Descending (int[] number){
        for (int i=0;i<number.length-1;i++){
            int min = i;
            for (int j=i+1;j<number.length;j++){
                if (number[j] > number[min]){
                    min = j;
                }
            }
            int num = number[i];
            number[i] = number[min];
            number[min] = num;
        }
        return number;
    }
    
    
}
