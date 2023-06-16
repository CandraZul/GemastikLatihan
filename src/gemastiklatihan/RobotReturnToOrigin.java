/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class RobotReturnToOrigin {
     public boolean judgeCircle(String moves) {
        int[] pos = {0,0};
        for (int i=0;i<moves.length();i++){
            switch (moves.charAt(i)) {
                case 'U' -> pos[1]++;
                case 'D' -> pos[1]--;
                case 'L' -> pos[0]--;
                case 'R' -> pos[0]++;
                default -> {
                }
            }
        }

        return pos[0]==0 && pos[1]==0;
    }
}
