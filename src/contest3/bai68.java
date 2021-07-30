/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.Scanner;

/**
 *
 * @author giang
 */
public class bai68 {
      static int M = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int C[][] = new int[1005][1005]; // Cij la ket qua C(n,k)
            for(int i = 0; i <= n; i ++) {
                for (int j = 0; j<=i ; j++) {
                    if(j == 0 || j == i) {
                        C[i][j] = 1;
                    }
                    else {
                        C[i][j] = (C[i-1][j] + C[i-1][j-1]) %M;
                    }
                }
            }
            System.out.println(C[n][k]);
        }

    }
}
// TÍNH C(N,K)