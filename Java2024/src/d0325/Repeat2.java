package d0325;

import java.util.Scanner;
public class Repeat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int sum =0;
		
		for(int i=1;i<=inp;i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
