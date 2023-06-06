/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class SignOfProductOfArray {
     public int arraySign(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<0){
                count++;
            }
            else if (nums[i]==0){
                return 0;
            }
        }
        if (count%2 == 0){
            return 1;
        } else{
            return -1;
        }
    }
}
