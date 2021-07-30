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
public class bai21 {
     static boolean chuaXet[] = new boolean[100];
    static boolean xuoi[] = new boolean[100];
    static boolean nguoc[] =new boolean[100];
    static int dem, n;
    static int x[] =new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            
            dem = 0;
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                chuaXet[i] = true;
            }
            for (int i = 1; i <= 2 * n - 1; i++) {
                xuoi[i] = true;
                nguoc[i] = true;
            }
            queen(1);
            System.out.println(dem);
        }
    }

    private static void queen(int i) {
        for (int j = 1; j <= n; j++) {
            if (chuaXet[j] && xuoi[i - j + n] && nguoc[i + j - 1]) {
                x[i] = j;
                chuaXet[j] = false;
                xuoi[i - j + n] = false;
                nguoc[i + j - 1] = false;

                if (i == n) {
                    dem++;
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
}
