/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;

/**
 *
 * @author giang
 */
public class bai35 {
    static int M = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t;
        long n, k;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextLong();
            k = sc.nextLong();
            System.out.println(luyThua(n, k));
        }
    }

    private static long luyThua(long n, long k) {
        if (k == 0) {
            return 1;
        }
        long temp = luyThua(n, k / 2);
        if (k % 2 == 0) {
            return (temp%M * temp%M) % M;
        }
        return (n * temp%M * temp%M) % M;
//        if (k % 2 == 1) {
//            return (n * temp % M * temp % M) % M;
//        }
//        return (temp % M * temp % M) % M;

    }
}
