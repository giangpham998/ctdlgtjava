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
public class bai25 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        String s;
        sc.nextLine();
        while (t-- > 0) {
            s = sc.nextLine();
            sinhHoanVi(s);
            System.out.println("");
        }
    }

    private static void sinhHoanVi(String s) {
        int n = s.length();
        int a[] = new int[n];
        for(int i = 0; i<n ; i++) {
            a[i] = i;
        }
        for (int i = 0; i <n; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");

        boolean OK = true;

        while (OK) {
            int j = n - 2;
            while (j >= 0 && a[j] > a[j + 1]) {
                j--;
            }
            if (j >= 0) {
                int k = n - 1;
                while (a[j] > a[k]) {
                    k--;
                }
                int t = a[j];
                a[j] = a[k];
                a[k] = t;
                int r1 = j + 1, s1 = n - 1;
                while (r1 < s1) {
                    int temp = a[r1];
                    a[r1] = a[s1];
                    a[s1] = temp;
                    r1++;
                    s1--;
                }
            } else {
                OK = false;
            }
            if (OK) {
                for (int i = 0; i < n; i++) {
                    System.out.print(s.charAt(a[i]));
                }
                System.out.print(" ");
            }
        }

//        
    }
}
