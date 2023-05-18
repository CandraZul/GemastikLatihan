/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        String result = new String();
        
        
        for (int i=0;i<word1.length()+word2.length();i++){
            if(word1.length()>i && word2.length()>i){
                result = result + word1.charAt(i) + word2.charAt(i);
            }else if(word1.length()<=i && word2.length()>i){
                result = result + word2.charAt(i); 
            }else if(word1.length()>i && word2.length()<=i){
                result = result + word1.charAt(i); 
            }

        }
        return result;
    }
}
