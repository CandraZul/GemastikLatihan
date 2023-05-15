/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class RomanToInt {
    public int romanToInt(String s) {
        int answer=0, now=0, prev=0;
        for(int i=s.length()-1;i>-1;i--){
            switch(s.charAt(i)){
                case 'M' -> now=1000;
                case 'D' -> now=500;
                case 'C' -> now=100;
                case 'L' -> now=50;
                case 'X' -> now=10;
                case 'V' -> now=5;
                case 'I' -> now=1;
                default -> {
                }
            }
            if(now>=prev){
                answer=answer+now;
            }
            else if(now<prev){
                answer=answer-now;
            }
            prev=now;

        }
        return answer;
    }
}
