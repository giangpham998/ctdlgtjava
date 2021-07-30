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
public class bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        a = sc.next();
        b = sc.next();
//        System.out.println(a+ " " + b);
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(c[i] == '6') c[i] ='5';
        }
        for(int i = 0; i < d.length; i++) {
            if(d[i] == '6') d[i] ='5';
        }
        System.out.print(Integer.parseInt(String.valueOf(c)) +Integer.parseInt(String.valueOf(d)) + " ");
        
        for(int i = 0; i < c.length; i++) {
            if(c[i] == '5') c[i] ='6';
        }
        for(int i = 0; i < d.length; i++) {
            if(d[i] == '5') d[i] ='6';
        }
        System.out.println(Integer.parseInt(String.valueOf(c)) +Integer.parseInt(String.valueOf(d)));
    }
}
