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
public class bai40 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        String s;
        while(t-- >0) {
            s = sc.nextLine();
            System.out.println(process(s));
        }
    }

    private static String process(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(st.isEmpty()) {
                st.push(c);
            }
            else {
                char temp = st.peek();
                if(temp == '(' && c == ')') {
                    st.pop();
                    continue;
                }
                if(temp == '[' && c == ']') {
                    st.pop();
                    continue;
                }
                if(temp == '{' && c == '}') {
                    st.pop();
                    continue;
                }
                st.push(c);
            }
        }
        if(st.isEmpty()) return "YES";
        else return "NO";
    }
}
