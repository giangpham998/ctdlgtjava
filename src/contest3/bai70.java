/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.Scanner;

/**
 *
 * @author giang
 */
public class bai70 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        String s;
        while (t-- > 0) {
            s = sc.nextLine();
            System.out.println(process(s));
        }

    }

    private static int process(String s) {

        int n = s.length();
        s = " " + s;
        boolean f[][] = new boolean[1005][1005]; // Fij = true neu doan i -> j la doi xung

        for (int i = 0; i <= n; i++) {
            f[i][i] = true;
        }
        for (int j = 1; j <= n; j++) { // Chu y for j  for i
            for (int i = 1;  i < j; i++) {
                if (s.charAt(i) == s.charAt(j) && i != j - 1) {
                    f[i][j] = f[i + 1][j - 1];
                } else if (s.charAt(i) == s.charAt(j) && i == j - 1) {
                    f[i][j] = true;
                } else {
                    f[i][j] = false;
                }
            }
        }
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (f[i][j] == true) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
