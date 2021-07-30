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
public class bai66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        while(t-- >0) {
            n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(process(a));
        }
    }

    private static int process(int[] a) {
        int n = a.length;
        int ans = 0;
        int F[] = new int[1005];
        for (int i = 0; i < n; i++) {
            F[i] = 1; 
            for (int j = 0; j < i; j++) {
                if(a[j] <= a[i]) {
                    F[i] = Math.max(F[i], F[j] +1);
                }
            }
            ans = Math.max(ans, F[i]);
        }
        return n - ans;
    }
}
// SỐ BƯỚC ÍT NHẤT