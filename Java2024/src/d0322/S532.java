package d0322;

import java.util.Scanner;

public class S532 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();

		if (a & b>4) {
			System.out.println("A");
		} else if (a & b >= 6) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		sc.close();
		return ;
	}
}
