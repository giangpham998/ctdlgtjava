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
public class bai36 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        long n, k;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextLong();
            k = sc.nextLong();
            if(k%2 == 1) System.out.println("1");
            else System.out.println(process(n, k));
        }
    }

    private static long process(long n, long k) {
        long temp = (long) (Math.pow(2, n) / 2);
        if (k == temp) {
            return n;
        }
        if (k < temp) {
            return process(n - 1, k);
        }
        return process(n - 1, k - temp);

    }
}
