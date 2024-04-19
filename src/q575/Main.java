package q575;

import java.util.Scanner;

public class Main {
	public int jpow(int p1, int p2) {
		int res = 1;
		
		for(int i =0; i < p2; i++) {
			res *= p1;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		Main main = new Main();
		int ret = main.jpow(a, b);
		 System.out.println(ret);
	}
	}
