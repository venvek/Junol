package q1430b;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int g = A*B*C;
		int [] cnt= new int[10];
		String cm = Integer.toString(g);
		String h = Integer.toString(g);
		String[] Num = h.split("");
	//	String exp = Num[0]; Num[i] System.out.println(Num[i]);
	//	ArrayList<Integer> arrNum = new ArrayList<Integer>();
	/*
	 * for(int i =0; i<h.length(); i++) { System.out.println(Num[i]); cnt[i]++; }
	 */
		do {
			int r = g %10;
			cnt[r]++;
			g= g/10;
		}while(g!=0);
		for(int i=0; i<cnt.length;i++) {
			System.out.println(cnt[i]);
		}
		}
	}

