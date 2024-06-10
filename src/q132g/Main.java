package q132g;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum =0;
		for(int i = 1; i < N+1; i++) {
			if(i % 5 == 0) {
				sum+=i;
			}
		}System.out.println(sum);
	}
}
