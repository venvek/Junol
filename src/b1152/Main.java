package b1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String a = sc.nextLine().trim();
		for(int i =0; i<a.length(); i++) {
		if(a.charAt(i) == ' ') {
		cnt++;	
		}
	}System.out.println(cnt+1);
	}
	}

