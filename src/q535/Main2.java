package q535;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		if(a>=4.0) {
			System.out.println("scholarship");
		}
		else if(a>=3.0) {
			System.out.println("next semester");
		}
		else if(a>=2.0) {
			System.out.println("seasonal semester");
		}else {
			System.out.println("retake");	
		}sc.close();
}
}