/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

import java.util.Stack;

/**
 *
 * @author candr
 */
public class ParenthesisStack {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i=0;i<s.length();i++){
                Character x = s.charAt(i);
                if (x=='(' || x=='{' || x=='['){
                    stack.push(x);
                }else{ 
                    if(stack.isEmpty()){
                        return false;
                    }else if(stack.peek()=='(' && x!=')'){
                        return false;
                    }else if(stack.peek()=='[' && x!=']'){
                        return false;
                    }else if(stack.peek()=='{' && x!='}'){
                        return false;
                    }else{
                        stack.pop();
                    }       
                }
            }
            return stack.isEmpty();
        }
    }
}
