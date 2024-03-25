package d0325;

import java.util.Scanner;
public class For {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] scores = {9, 7, 8, 9, 8};
		
		int sum = 0;
		for(int s : scores) {
			sum += s;
		}
		System.out.println("sum : " + sum);
	}
}
