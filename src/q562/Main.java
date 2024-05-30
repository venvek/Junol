package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int avg = 0;	
		int Num [] = new int [10];
		
		for(int i =0; i<10; i++) {
		Num[i] = sc.nextInt();
		if((i+1) % 2 == 0) {
			sum += Num[i];
		}else if ((i+1) % 2 == 1) {
			avg += Num[i];
		}
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (double)avg/5);

		
	}
}
