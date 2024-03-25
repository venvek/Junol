package d0322;

import java.util.Scanner;

public class scientice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		if(a>0) { 
			System.out.println(a);
		} else if(a<=0) {
			System.out.println(a);
			System.out.println("minus");
		}
	}
}