package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=1;
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("");
			for(int j=0; j<m; j++) {
				System.out.print(a++ +" ");
			}
		}
	}
}



