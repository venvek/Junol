package q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double [] score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		int cs =sc.nextInt();
		int cs2 =sc.nextInt();
		
		sc.close();
		double sum = score[cs-1] + score[cs2-1];
			System.out.println(sum);
		}
	}

