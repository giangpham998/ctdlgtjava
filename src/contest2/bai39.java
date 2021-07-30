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
public class bai39 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        String s;
        while (t-- > 0) {
            s = sc.nextLine();
            String temp[] = s.split(" ");
            String ans = "";
            for (String string : temp) {
                StringBuffer s1 = new StringBuffer(string);
                ans += s1.reverse().toString() + " ";
            }
            
            System.out.println(ans);
            
        }

    }
}
