/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int biggest = 0;
        for (int i=0;i<accounts.length;i++){
            int sum = 0;
            for (int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if (sum>biggest){
                biggest = sum;
            }
        }
        return biggest;
    }
}
