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
public class bai8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        String s;
        while (t-- > 0) {
            s = sc.nextLine();
            System.out.println(sinhKeTiep(s));
        }

    }

    private static String sinhKeTiep(String s) {
        String result = "";
        char ch[] = new char[1001];
        for (int i = 0; i < s.length(); i++) {
            ch[i+1] = s.charAt(i);
        }
        int i = s.length();
        // 10011 ; i= 5 => 4
        while(i > 0 && ch[i] != '0') {
            ch[i] = '0';
            i--; 
        }
        if(i > 0) ch[i] = '1';
        for (int j = 1; j <= s.length(); j++) {
            result +=  ch[j];
        }
        return result;
    }
}
