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
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int n;
        while (t-- >0) {
            n = sc.nextInt();
            fib(n);
        }
    }

    private static void fib(int n) {
        if(n == 0) System.out.println("0");
        if (n ==1 || n == 2) System.out.println("1");
        
        if(n > 2) {
            long f1 = 1, f2 = 1, fn = 0;
            for(int i = 3; i <=n; i++) {
                fn = f1 + f2; 
                f1 = f2;
                f2 = fn;
            }
            System.out.println(fn);
        }
       
    }
}
