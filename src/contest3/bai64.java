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
public class bai64 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       n = sc.nextInt();
       int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            
        }
        System.out.println(process(a, n));
    }
    private static int process(int[] a, int n) {
        int ans = 0;
        int f[] = new int[n]; // Fi là dãy con tăng dài nhất đến vị trí i
        for(int i = 0; i< n; i++) {
            f[i] = 1;
            for(int j = 0; j < i; j++) {
                if(a[j] < a[i]) {
                    f[i] = Math.max(f[i], f[j]+1);
                }
            }
            ans = Math.max(ans,f[i]);
        }
        return ans;
    }   
}
// DÃY CON TĂNG DÀI NHẤT CỦA XÂU (STRING, SỐ)