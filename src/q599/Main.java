package q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int s = a.length();
		char [] c = new char[100];
		
		for(int i =0; i< s; i++) {
		c[i] = a.charAt(i);
		
		if(c[i]>= 'A' && c[i]<='Z' || c[i]>= 'a' && c[i]<='z') {
			System.out.print(String.valueOf(c[i]).toUpperCase());
		}
		}
	}
}
