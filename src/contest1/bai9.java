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
public class bai9 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
//            for (int i = 0; i < a.length; i++) {
//                System.out.println(a[i]);
//            }
            sinhHoanVi(a);
        }
    }

    private static void sinhHoanVi(int[] a) {
        int j = a.length - 2;
        while (j >= 0 && a[j] > a[j + 1]) {
            j--;
        }
        if (j >= 0) {
            int k = a.length - 1;
            while (a[j] > a[k]) {
                k--;
            }
            int t = a[j];
            a[j] = a[k];
            a[k] = t;
            int r = j + 1, s = a.length - 1;
            while (r < s) {
                int temp = a[r];
                a[r] = a[s];
                a[s] = temp;
                r++;
                s--;
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println("");
        }
        else {
            for (int i = 0; i < a.length; i++) {
                System.out.print((i+1) + " ");
            }
            System.out.println("");
        }

    }
}
