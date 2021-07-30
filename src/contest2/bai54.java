/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author giang
 */
public class bai54 {
      static char[] arr = new char[10];

    static void solve(int n) {
        while (true) {
            for (int i = 9; i >= 0; i--) {
                if (arr[i] == '0') {
                    arr[i] = '9';
                    for (int j = i + 1; j <= 9; j++) {
                        arr[j] = '0';
                    }
                    long temp = Long.parseLong(String.valueOf(arr));
                    if (temp % n == 0) {
                        System.out.println(temp);
                        return;
                    }
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            Arrays.fill(arr, '0');
            solve(n);
        }
    }
}
