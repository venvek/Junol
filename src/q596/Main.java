package q596;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[100];
        String str = sc.next();
        int len = str.length();
        int num = sc.nextInt();
 
        for (int i = 0; i < len; i++) {
            arr[i] = str.charAt(i);
        }
        if (num > len) {
            num = len;
        }
        for (int i = len - 1; i >= len - num; i--) {
            System.out.print(arr[i]);
        }
    }
}