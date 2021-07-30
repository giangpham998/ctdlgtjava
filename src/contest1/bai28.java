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
public class bai28 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();

        while (t-- > 0) {
            n = sc.nextInt();
//            sc.nextLine();
            String s[] = new String[n];
            for (int i = 0; i < s.length; i++) {
                s[i] = sc.next();
            }
//           for(int i = 0; i<s.length; i++) {
//               System.out.print(s[i]);
//           }
            String s1 = "";
            String s2 ="", s3 = "";
            for(int i = 0; i<s.length; i++) {
                s1 += s[i];
           }
           char ch[] = s1.toCharArray();
           Arrays.sort(ch);   
           for (int i = 0; i<ch.length; i++) {
               if(i%2 == 0) s2 += ch[i];
               else s3 += ch[i];
           }
//            System.out.println(s2 + " " + s3);
            System.out.println(Long.parseLong(s2) + Long.parseLong(s3));
        }
    }
}
