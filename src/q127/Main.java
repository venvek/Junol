package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double cnt = 0;
		for (;;) {
			int num = sc.nextInt();
			if (num >= 0 && num <= 100) {
				sum += num;
				cnt++;
			} else {
				break;
			}
		}sc.close();
		System.out.println("sum : " + sum);
		System.out.print("avg : ");
		System.out.printf("%.1f", sum / cnt);
	}
}