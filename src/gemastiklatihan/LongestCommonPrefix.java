/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class LongestCommonPrefix {
    class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        
        String prev = strs[0];
        int n = prev.length();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || prev.charAt(i) != strs[j].charAt(i)) {
                    return prev.substring(0, i);
                }
            }
        }
        
        return prev;
    }
}
}
