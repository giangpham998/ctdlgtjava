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
public class bai61 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        String s1, s2;
        sc.nextLine();
        while (t-- > 0) {
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            System.out.println(process(s1, s2));
        }
    }

    private static int process(String s1, String s2) {
        int ans = 0;
        int n = s1.length();
        int m = s2.length();
        // Fij là xâu con chung dài nhất của i phần tử dãy s1 và j phần tử dãy s2
        int F[][] = new int[1001][1001]; 
        s1 = " " + s1;
        s2 = " " + s2;
//        for (int i = 0; i <= s1.length(); i++) {
//            for (int j = 0; j <= s2.length(); j++) {
//                F[i][j] = 0;
//            }
//        }
                for (int i = 0; i <= s1.length(); i++) {
                F[i][0] = 0;
            }
                for (int j = 0; j <= s2.length(); j++) {
                F[0][j] = 0;
            }
                //---------------
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    F[i][j] = F[i - 1][j - 1] + 1;
                } else {
                    F[i][j] = Math.max(F[i][j - 1], F[i - 1][j]);
                }
                ans = Math.max(ans, F[i][j]);
            }
        }
//        return ans;
        return F[n][m];

    }
}
// XÂU CON CHUNG DÀI NHẤT CỦA 2 XÂU