/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int ten = 0;
        int five = 0;
    for (int i=0;i<bills.length;i++){
        if (five <0){
            return false;
        }
        if (bills[i]==5){
            five++;
        } else if (bills[i]==10){
            ten++;
            five--;
        } else {
            if (ten >= 1){
                ten--;
                five-=1;
            } else{
                five -= 3;
            }
        }
    }
    if (five<0){
        return false;
    } else{
        return true;
    }
}
}
