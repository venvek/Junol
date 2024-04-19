package q531;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double wg = sc.nextDouble();
		sc.close();
		if(wg<50.80) { 
			System.out.println("Flyweight");
	}	else if(wg<61.23) {
			System.out.println("Lightweight");
	}	else if(wg<72.57) {
			System.out.println("Middleweight");
    }	else if(wg<=88.45) {
			System.out.println("Cruiserweight");
}		else {
			System.out.println("Heavyweight");
}
}
}