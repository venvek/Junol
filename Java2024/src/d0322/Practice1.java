package d0322;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		if (a > 10) {
			System.out.println(a);
			System.out.println("10보다 큰 수를 입력하셨습니다");
		} else {
			System.out.println(a);
		sc.close();
		}
	}
}
