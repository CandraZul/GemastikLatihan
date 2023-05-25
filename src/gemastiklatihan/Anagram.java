/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class Anagram {
        public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()){
            return false;
        }
        int[] abjad = new int[26];

        for (int i=0; i<s.length();i++){
            abjad[s.charAt(i)-'a'] += 1;
            abjad[t.charAt(i)-'a'] -= 1;
        }

        for (int i=0; i<26; i++){
            if (abjad[i] != 0){
                return false;
            }
        }
        return true;
    }
}
