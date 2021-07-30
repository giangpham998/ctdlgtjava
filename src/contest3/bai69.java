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
public class bai69 {
     static int M = 1000000007;
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t, n, k;
            t = sc.nextInt();
            while(t-- >0) {
                n = sc.nextInt();
                k = sc.nextInt();
                System.out.println(process(n, k));
            }
    }

    private static long process(int n, int k) {
        long F[] = new long[1000005];
        F[0] = 1;
        F[1] = 1;
        if(k == 1) F[2] = 1;
        else F[2] = 2;
        for(int i = 3; i <=n; i++) {
            for(int j = 1; j <=k; j++) {
                if(i - j >=0) {
                    F[i] += F[i-j];
                    F[i] %= M;
                }
            }
        }
        return F[n];
    }
}
// BẬC THANG