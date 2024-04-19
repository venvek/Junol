package q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		
		if(a==65) {
			System.out.println("Excellent");
		}else if (a==66) {
			System.out.println("Good");
		}else if (a==67) {
			System.out.println("Usually");
		}else if (a==68) {
			System.out.println("Effort");
		}else if (a==70) {
			System.out.println("Failure");
		}else {
			System.out.println("error");
			sc.close();
	}
}
}