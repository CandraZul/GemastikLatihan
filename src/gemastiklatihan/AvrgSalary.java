/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class AvrgSalary {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0;i<salary.length;i++){
            if (salary[i] >= max){
                max = salary[i];
            }
            if (salary[i]<=min){
                min = salary[i];
            }
            sum += salary[i];
        }
        sum = sum - min - max;
        return (double) sum / (salary.length-2);
    }
}
