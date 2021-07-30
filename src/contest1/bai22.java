/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.Scanner;

/**
 *
 * @author giang
 */
public class bai22 {
      static boolean chuaXet[] = new boolean[100];
    static boolean xuoi[] = new boolean[100];
    static boolean nguoc[] =new boolean[100];
    static int n, max;
    static int x[] =new int[100], a[][] = new int[9][9];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            n = 8;
            for (int i = 1; i <= 8; i++) {
                for (int j = 1; j <= 8; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            max = -1;
            for (int i = 1; i <= n; i++) {
                chuaXet[i] = true;
            }
            for (int i = 1; i <= 2 * n - 1; i++) {
                xuoi[i] = true;
                nguoc[i] = true;
            }
            queen(1);
            System.out.println(max);
        }
    }

    private static void queen(int i) {
        for (int j = 1; j <= n; j++) {
            if (chuaXet[j] && xuoi[i - j + n] && nguoc[i + j - 1]) {
                x[i] = j;
                chuaXet[j] = false;
                xuoi[i - j + n] = false;
                nguoc[i + j - 1] = false;

                if (i == n && sum() > max) {
                    max = sum();
//                    System.out.println(dem);
                } else {
                    queen(i + 1);
                }
                chuaXet[j] = true;
                xuoi[i - j + n] = true;
                nguoc[i + j - 1] = true;
            }
        }
    }

    private static int sum() {
        int tong = 0;
        for (int i = 1; i <= 8; i++) {
            tong += a[i][x[i]];
        }
        return tong;
    }
}
