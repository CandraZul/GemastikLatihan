/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class CanMakeArithmaticsProgression {
//    A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
    //Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.
        public boolean canMakeArithmeticProgression(int[] arr) {
        int num;
        int diff;
        for (int i=0;i<arr.length;i++){
            num = i;
            for (int j=i;j<arr.length;j++){
                if (arr[j] < arr[num]){
                    num = j;
                }
            }
            diff = arr[i];
            arr[i] = arr[num];
            arr[num] = diff;
        }
        //ternyata mengurutkan array bisa memakai Arrays.sort
        

        for (int i=1;i<arr.length-1;i++){
            if (arr[0]-arr[1] != arr[i] - arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
