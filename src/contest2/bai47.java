/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author giang
 */
public class bai47 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        String s;
        sc.nextLine();
        while (t-- > 0) {
            s = sc.nextLine();
            System.out.println(process(s));
        }
    }

    private static int process(String s) {
        Stack<Double> st = new Stack<Double>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (isNum(c)) {
                st.push((double) c - '0');
            } else {
                double x1 = st.peek();
                st.pop();
                double x2 = st.peek();
                st.pop();
                switch (c) {
                    case '+':
                        st.push((double) x1 + x2);
                        break;
                    case '-':
                        st.push((double) x1 - x2);
                        break;
                    case '*':
                        st.push((double) x1 * x2);
                        break;
                    case '/':
                        st.push((double) x1 / x2);
                        break;

                }
            }
        }
        int k =  st.peek().intValue();
        return k;
    }

    private static boolean isNum(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }
}
