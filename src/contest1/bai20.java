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
public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        long a, b;
        t = sc.nextInt();
        while (t-- > 0) {
            a = sc.nextLong();
            b = sc.nextLong();
            tachPhanSo(a, b);
            System.out.println("");
        }
    }

    private static void tachPhanSo(long a, long b) {
        if (b % a == 0) {
            System.out.print("1/" + b / a);
            return;
        } else {
            long temp = b / a + 1;
            System.out.print("1/" + temp + " + ");
            tachPhanSo(a * temp - b, b * temp);
        }
    }
}
