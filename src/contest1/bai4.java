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
public class bai4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        String s;
        while (t-- > 0) {
            s = sc.nextLine();
            String s1 = daoChuoi(s);
            boolean kt = true;
            for (int i = 0; i < s.length(); i++) {
                if (Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 1) {
                    System.out.println("NO");
                    kt = false;
                    break;
                }

            }
            if (kt) {
                if (s.equals(s1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
    }

    public static String daoChuoi(String input) {
        if (input.isEmpty()) {
            return input;
        }
        return daoChuoi(input.substring(1)) + input.charAt(0);
    }
}
