/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class FindDiff {
    public static void main(String[] args) {
       String s = "abcd";
       String t = "abcde";
        
       String h = t;
        for (int i=0;i<t.length();i++){
            for(int j=0;j<s.length();j++){
                if (t.charAt(i)==s.charAt(j)){
                    h = h.replaceFirst(String.valueOf(t.charAt(i)), "");
                    break;
                }
            }
        }
        System.out.println(h);
        
    }
}
    

