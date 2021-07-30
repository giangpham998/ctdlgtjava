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
public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        String s1 = rutGon(s);
        if(s1.length() == 0) System.out.println("Empty String");
        else System.out.println(s1);
    }

    private static String rutGon(String s) {
        String result = "";
        boolean check = true; // s chua thay doi
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (i != s.length() - 1) {
                char y = s.charAt(i + 1);
                if (x == y) {
                    result += "";
                    check = false;
                    i++;
                } else {
                    result += x;
                }
            } else {
                result += x;
            }
        }
        if (!check) {
            return rutGon(result);
        }
        return result;
    }
}
