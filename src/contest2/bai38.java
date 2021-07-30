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
public class bai38 {
      static long m = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        long n;
        while (t-- > 0) {
            n = sc.nextLong();
            System.out.println(fib(n));
        }
    }

    private static long fib(long n) {
        long F[][] = new long[][]{{1, 1}, {1, 0}};
        if (n == 0) {
            return 0;
        }
        power(F, n - 1);
        return F[0][0];
    }

    private static void power(long[][] F, long n) {
        long M[][] = new long[][]{{1, 1}, {1, 0}};
        if (n == 0 || n == 1) {
            return;
        }
        power(F, n / 2);
        mul(F, F);
        if (n % 2 == 1) {
            mul(F, M);
        }
    }

    private static void mul(long[][] F, long[][] M) {
        long x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        long y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        long z = F[1][0] * M[0][0] + F[1][1] * M[0][1];
        long t = F[1][0] * M[0][1] + F[1][1] * M[1][1];
        F[0][0] = x % m;
        F[0][1] = y % m;
        F[1][0] = z % m;
        F[1][1] = t % m;

    }
}
