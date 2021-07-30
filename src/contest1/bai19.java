/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author giang
 */
public class bai19 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        long n;
        sc.nextLine();
        while (t-- >0) {
            n = sc.nextLong();  
            Vector<String> cubes = new Vector<>();
            String num = String.valueOf(n);
            for(long i =1; i*i*i <= n; i++ ) {
                long temp = i*i*i;
                cubes.add(String.valueOf(temp));
            }
//            for (String cube : cubes) {
//                System.out.println(cube);
//            }
            
            String ans = "";
            ans += findCubeMax(num, cubes);
            System.out.println(ans);
        }
    }
    
    private static String findCubeMax(String num, Vector<String> cubes) {
        Collections.reverse(cubes);
        for(int i = 0; i< cubes.size(); i++) {
            String s = cubes.get(i);
            int dem = 0;
            for(int j = 0; j<num.length(); j++) {
                if(num.charAt(j) == s.charAt(dem)) {
                    dem++;
                }
                if(dem == s.length() ) {
                    return s;
                }
            }
        }
        return "-1";
    }
}
