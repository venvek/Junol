package q1341;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String s1=sc.next();
		int S = sc.nextInt();
		int E = sc.nextInt();
		if(S >= E) {
		for(int j =S; j>=E; j--) {
		for(int i=1; i<10; i++) {
		System.out.printf(j+ " * " +i + " =");
		System.out.printf("%3d",j*i);
		System.out.print("   ");
		if(i % 3 == 0) {
			System.out.println(" ");
		}
		}
		System.out.println(" ");
		}
		}
		else if (E <= S) {
			for(int j =S; j>=E; j--) {
				for(int i=1; i<10; i++) {
				System.out.printf(j+ " * " +i + " =");
				System.out.printf("%3d",j*i);
				System.out.print("   ");
				if(i % 3 == 0) {
					System.out.println(" ");
				}
				}
				System.out.println(" ");
				}
				}
		}
	
	
}
