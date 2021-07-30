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
public class bai34 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        process(a);
    }

    private static void process(int[] a) {
        int dem = 1;
        int n = a.length;
        boolean swaped;
        for (int i = 0; i < n - 1; i++) {
            swaped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j+1);
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
            System.out.print("Buoc " + dem + ": ");
            display(a);
            dem++;
            System.out.println("");

        }

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
