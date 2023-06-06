/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class IsMonotonic {
        public boolean isMonotonic(int[] nums) {

        if (nums[0]<nums[nums.length-1]){
            for (int i=0;i<nums.length-1;i++){
                if (nums[i]>nums[i+1]){
                    return false;
                }
            }
            return true;
        }
        else{
            for (int i=0;i<nums.length-1;i++){
                if (nums[i]<nums[i+1]){
                    return false;
                }
            }
            return true;
        }
    }
}
