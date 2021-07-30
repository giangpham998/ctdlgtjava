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
public class bai67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            System.out.println(process(n));
        }
    }

    private static long process(int n) {
        long F[] = new long[55]; // Fi la so cach di chuyen toi dinh i
        F[0] = 1;
        F[1] = 1;
        F[2] = 2;  
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
//                if (i - j >= 0) {
//                    F[i] += F[i - j];
//                }
                F[i] += F[i - j];
            }
        }
        return F[n];
    }
}
// CON ẾCH