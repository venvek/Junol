package q131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int min = Math.min(a, b);
		int max = Math.max(a, b);
			if(a>b) {
				for (int i =min; i<=max; i++) {
				System.out.print(i + " ");
			}
			}else if(b>a) {
				for (int j =min; j<=max; j++) {
				System.out.print(j + " ");
			}
			}
			else {
				System.out.print(a + " ");
		}
	}
}
	
