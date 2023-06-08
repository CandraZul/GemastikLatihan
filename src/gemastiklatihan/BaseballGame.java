/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author candr
 */
public class BaseballGame {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int indeks = -1;
        for (String operation : operations) {
            if ((Character.isDigit(operation.charAt(0))) || (operation.charAt(0) == '-')) {
                list.add(Integer.valueOf(operation));
                indeks++;
            } else if (operation.equals("C")) {
                if (indeks >= 0) {
                    list.remove(indeks);
                    indeks--;
                }
            } else if (operation.equals("D")) {
                if (indeks >= 0) {
                    list.add(2 * list.get(indeks));
                    indeks++;
                }
            } else if (operation.equals("+")) {
                if (indeks >= 1) {
                    list.add(list.get(indeks) + list.get(indeks - 1));
                    indeks++;
                } else if (indeks == 0) {
                    list.add(list.get(indeks));
                    indeks++;
                }
            }
        }

        int sum = 0;
        for (int i : list){
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        BaseballGame B = new BaseballGame();
        
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        
        System.out.println(B.calPoints(ops));
    }
}
