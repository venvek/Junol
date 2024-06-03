package q1304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		sc.close();
		for(int i =0; i<n; i++) {
			if(n >0) {
			System.out.println("");
			}
			for (int j=0; j<n; j++) {
			
			System.out.print(num + " ");
			num = num+n;
			}
			num=2;
			num+=i; 
		}
	}
}
