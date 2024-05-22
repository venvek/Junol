package q129;

import java.util.Scanner;

public class Suc  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char C = '\0';
		
		do {
			System.out.print("Base = ");
			int Base = sc.nextInt();
			System.out.print("Height = ");
			int Height = sc.nextInt();
			System.out.print("Triangel width = ");
			
			System.out.printf("%.1f%n",(double) Base * Height /2);
			
			System.out.println("Continue?" + " = ");
			C = sc.next().charAt(0);
		}
		while (C == 'y' || C == 'Y'); {
			return;
		}
	}
}