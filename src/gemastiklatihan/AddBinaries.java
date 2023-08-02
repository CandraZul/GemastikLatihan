/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class AddBinaries {
    public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    int sum = 0;
    while (i >= 0 || j >= 0){
        sum = carry;
        if (i>=0){
            sum += a.charAt(i) - '0';
            i--;
        }
        if (j>=0){
            sum += b.charAt(j) - '0';
            j--;
        }
        sb.append(sum % 2);
        carry = sum/2;
    }
    if (carry>0){
        sb.append(1);
    }

    sb.reverse();
    return sb.toString();
}
}
