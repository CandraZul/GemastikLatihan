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
public class InsertionSort {
    public int[] Ascending (int[] num){
        int[] sortedNum = Arrays.copyOf(num, num.length);
        
        for (int i=0;i<sortedNum.length;i++){
            int j=i;
            while (j>0 && sortedNum[j-1]>sortedNum[j]){
                int temp = sortedNum[j];
                sortedNum[j] = sortedNum[j-1];
                sortedNum[j-1] = temp;
                
                j--;
            }   
        }
        return sortedNum;
    }
    
    public int[] Descending (int[] num){
        int[] sortedNum = Arrays.copyOf(num, num.length);
        for (int i=0;i<sortedNum.length;i++){
            int j=i;
            while (j>0 && sortedNum[j-1]<sortedNum[j]){
                int temp = sortedNum[j];
                sortedNum[j] = sortedNum[j-1];
                sortedNum[j-1] = temp;

                j--;
            }   
        }
        return sortedNum;
}
    
    
    public static void main(String[] args) {
        int[] a= {8,2,3,1,4,3};
        InsertionSort A = new InsertionSort();
        
        int[] sortedNum = A.Descending(a);
        System.out.println(Arrays.toString(sortedNum));
        System.out.println(Arrays.toString(a));
    }
}

