package q577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		sc.close();
		if (a>b) {
			a = a/2;
			b = b*2;
		}else if (b>a) {
			a = a*2;
			b = b/2;
		}
		System.out.print(a+" ");
		System.out.print(b);
	}

}
