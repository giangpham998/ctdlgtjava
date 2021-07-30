/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author giang
 */
public class bai77 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            System.out.println(process(n));
        }
    }

    private static int process(int n) {
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            v.add(i * i);
        }
        // Fi la so luong it nhat cach phan tich n thanh tong binh phuong
        // Tim Fn
        int F[] = new int[10005];
        F[0] = 0;
        F[1] = 1;
        F[2] = 2;
        for (int i = 3; i <= n; i++) {
            F[i] = i; // Xau nhat la Fi = i
            for (int j = 0; j < v.size(); j++) {
                if (i - v.get(j) >= 0) {
                    F[i] = Math.min(F[i], F[i - v.get(j)] + 1);
                } else {
                    break;
                }

            }
        }
        return F[n];

    }
}
//tong binh phuong