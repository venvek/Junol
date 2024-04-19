package q596;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		sc.close();
		System.out.print(a.length());
		for(int i = a.length() -1, cnt=0; b < cnt; i--, cnt++) {
				System.out.print(a.charAt(i));
		}
		else {
			for(int i = a.length()-1; i>=0; i--) {
				System.out.print(a.charAt(i));
			}
		}
	}
}
