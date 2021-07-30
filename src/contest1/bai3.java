/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author giang
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        String s;
        t = sc.nextInt();
        sc.nextLine();
        while(t-- >0) {
            s = sc.nextLine();
            String s1 = "";
            int tong = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' )
                    s1 += s.charAt(i);
                else {
                    tong += Integer.parseInt(String.valueOf(s.charAt(i)));
                }
            }
            char ch[] = s1.toCharArray();
            Arrays.sort(ch);
            String s2 = new String(ch);
            System.out.println(s2+String.valueOf(tong));
        }
    } 
}
