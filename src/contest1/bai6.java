/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author giang
 */
public class bai6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        String s;
        while (t > 0) {
            t--;
            s = sc.nextLine();
            String s1 = chuanHoaEmail(s);
            list.add(s1);
            int dem = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(s1)) {
                    dem++;
                }
            }
            if (dem == 1) {
                System.out.println(s1 + "@ptit.edu.vn");
            }
            else if (dem >= 2) System.out.println(s1 + String.valueOf(dem) +"@ptit.edu.vn");
        }
    }

    private static String chuanHoaEmail(String s) {
        String result = "";
        s = s.replaceAll("\\s+", " ");
        s = s.trim();
        String s1[] = s.split(" ");
        String fName = s1[s1.length - 1];
        String name = "";
        for (int i = 0; i < fName.length(); i++) {
            name += String.valueOf(fName.charAt(i)).toLowerCase();
        }
        String lName = "";
        for (int i = 0; i <= s1.length - 2; i++) {
            lName += String.valueOf(s1[i].charAt(0)).toLowerCase();
        }
//        result += name + lName + "@ptit.edu.vn";
        result += name + lName;

        return result;
    }
}
