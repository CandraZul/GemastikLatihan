/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;
import java.util.Arrays;
/**
 *
 * @author candr
 */
public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
    Arrays.sort(nums);
    for (int i=nums.length-1;i>1;i--){
        if (nums[i]<nums[i-1]+nums[i-2]){
            return nums[i]+nums[i-1]+nums[i-2];
        }
    }
    return 0;
}
}
