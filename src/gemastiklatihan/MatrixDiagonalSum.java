/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
    int sum = 0;
    int n = mat.length;
    for (int i=0;i<n;i++){
        sum += mat[i][i] + mat[n-1-i][i];
    }

    if (n%2 != 0){
        sum -= mat[n/2][n/2];
    }

    return sum;
    }
}
