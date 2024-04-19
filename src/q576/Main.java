package q576;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char tx = sc.next().charAt(0);
		int b = sc.nextInt();
		int sum = a+b;
		int mu = a-b;
		int g = a*b;
		int n = a/b;
		sc.close();
		/*
		 * System.out.println(a); System.out.println(b); System.out.println(sum);
		 * System.out.println(mu); System.out.println(g); System.out.println(n);
		 */
		if (tx=='+') {
			System.out.println(a + " + " + b + " = " + sum);
		}else if (tx=='-') {
			System.out.println(a + " - " + b + " = " + mu);
		}else if (tx=='*') {
			System.out.println(a + " * " + b + " = " + g);
		}else if (tx=='/') {
			System.out.println(a + " / " + b + " = " + n);
		}else {
			System.out.println(a + " " + tx + " " + b + " = " + "0");
		}
}
}
