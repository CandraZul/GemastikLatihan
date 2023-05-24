/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class HaystackNeedle {
class Solution {
    public int strStr(String haystack, String needle){ 
        int result = -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                result = i;
                for (int j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        result = -1;
                        break;
                    } else if (j == needle.length() - 1) {
                        return i;
                    }
                }
            }
        }
        return result;
    }
}
}
