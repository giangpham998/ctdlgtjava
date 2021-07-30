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
public class bai37 {
      static long f[] = new long[93];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        long i;
        t = sc.nextInt();
        fib();
        while (t-- > 0) {
            n = sc.nextInt();
            i = sc.nextLong();
            System.out.println(process(n, i));
        }
    }

    private static void fib() {
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for ( int i = 3; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    private static char process(int n, long i) {
        if (i == 1) {
            if (n %2 == 1) {
                return 'A';
            }
            return 'B';
        }
        if (i <= f[n - 2]) {
            return process(n - 2, i);
        }
        return process(n - 1, i - f[n - 2]);

    }
}
