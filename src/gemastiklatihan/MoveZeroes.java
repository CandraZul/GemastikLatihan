/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class MoveZeroes {
     public void moveZeroes(int[] nums) {
        int last = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[last]=nums[i];
                last++;
            }
        }
        for (int i=last;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
