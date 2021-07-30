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
public class bai63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, m, n, o;
        t = sc.nextInt();
        String s1, s2, s3;
        while (t-- > 0) {
            m = sc.nextInt();
            n = sc.nextInt();
            o = sc.nextInt();
            sc.nextLine();
            // Chu y dau vao cua s1 s2 s3
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();
            System.out.println(process(s1, s2, s3));
        }
    }

    private static int process(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length(), o = s3.length();
        s1 = " " + s1;
        s2= " " + s2;
        s3 = " " + s3;
        
        int f[][][] = new int[105][105][105];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= o; k++) {
                    f[i][j][k] = 0;
                }
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= o; k++) {
                    if(s1.charAt(i) == s2.charAt(j) && s2.charAt(j) == s3.charAt(k))
                        f[i][j][k] = f[i-1][j-1][k-1] + 1;
                    else 
                        f[i][j][k] = Math.max(f[i-1][j][k], Math.max(f[i][j-1][k], f[i][j][k-1]));
                }
                
            }
        }
        return f[m][n][o];
        
    }
}
// DÃY CHUNG DÀI NHẤT CỦA 3 XÂU
// => Tương tự : Dãy chung dài nhất 2 xâu