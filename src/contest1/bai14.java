/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author giang
 */
public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        long M = 1000000007;
        while (t-- > 0) {
            n = sc.nextInt();
            long a[] = new long[n];
            PriorityQueue<Long> q = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                q.add(a[i]);
            }
            long s = 0, n1, n2;
            while (q.size() >= 2) {
                n1 = q.poll();
                n2 = q.poll();
                q.add((n1 + n2)%M);
                s += (n1 %M + n2 % M) % M;
                s %= M;
            }
            System.out.println(s);
        }
    }
}
