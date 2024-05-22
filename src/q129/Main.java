package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Ct = "";
	
		for(;;) {
		int cm = sc.nextInt();
		int h = sc.nextInt();
		int Tw = cm*h/2;
		Ct = sc.next();
		if(Ct.equals("y") || Ct.equals("Y")) {
		System.out.print("Base" + " = ");
		System.out.print("Height" + " = ");
		System.out.print("Triangel width" + " = ");
		System.out.printf("%.1f%n",(double) cm * h /2);
		System.out.println("Continue?" + " = ");
			}
			else {
			break;
			}
		
		}
	}
}
