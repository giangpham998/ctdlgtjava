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
public class bai62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            sc.nextLine();
            String s;
            s = sc.nextLine();
            System.out.println(process(s, n));

        }
    }

    private static int process(String s, int n) {
        s = " " + s;
        // Fij luu xau con chung dai nhat cua i phan tu xau a va j phan tu xau a
        int f[][] = new int[105][105];

//        for(int i = 0; i <= n; i ++) {
//            f[i][0] = 0;
//            f[0][i] = 0;
//        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                f[i][j] = 0;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) { // Chu y: i!=j
                    f[i][j] = f[i - 1][j - 1] + 1;
                } else {
                    f[i][j] = Math.max(f[i][j - 1], f[i - 1][j]);
                }
            }
        }
        return f[n][n];
    }
}
// DÃY CON LẶP LẠI DÀI NHẤT
/*
    Tương tự XÂU CON CHUNG DÀI NHẤT CỦA 2 XÂU
    =>  Xâu còn chung dài nhất của 2 xâu s và s
 */