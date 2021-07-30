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
public class bai65 {
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
        int f[] = new int[1005]; // Fi luu tong gia tri cac phan tu tang dan tu phan tu thu i
        for (int i = 0; i < n; i++) {
            f[i] = a[i]; // Khoi tao max den phan tu thu i la a[i]
            for (int j = 0; j < i; j++) {
                if(a[j] < a[i]) {
                    f[i] = Math.max(f[i], f[j] + a[i]);
                }
            } 
        }
        int ans = f[0];// Vi neu day giam dan thi f[0] la max
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }
}
// TỔNG LỚN NHẤT CỦA DÃY CON TĂNG DẦN