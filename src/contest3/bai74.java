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
public class bai74 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int t, n, v;
        t = sc.nextInt();
        while (t-- >0) {
            n = sc.nextInt();
            v = sc.nextInt();
            int a[] = new int[1005];
            int c[] = new int[1005];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                c[i] = sc.nextInt();
            }
            System.out.println(process(n, v, a, c));
        }
    }

    private static int process(int n, int v, int[] a, int[] c) {
        int f[][] = new int[1005][1005];
        // Fij la gt su dung max khi chon i vat dau tien voi gioi han the tich la j
        for (int i = 0; i <= v; i++) {
            f[0][i] = 0;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j<= v; j++) {
                f[i][j] = f[i-1][j];
                if(j > a[i]) { // neu chon vat i
                    f[i][j] = Math.max(f[i][j], f[i-1][j-a[i]] + c[i]);
                }
            }
        }
        return f[n][v];
    }
}
