/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class Palindrom {
    class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        String z = "";
        for(int i=y.length()-1;i>-1;i--){
            z = z+y.charAt(i);
        }
        return y.equals(z);
    }
    }}
