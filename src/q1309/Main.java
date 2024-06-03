package q1309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=n;
		long result = 1l;
		
		for(int i = 0; i<n; i++) {
			for(int j=0; i<n; i++) {
			if(num==1) {
				System.out.println(num+"! = " + num);
			}
			else {
			System.out.println(num+"! = " + num + " * " + (num-1)+ "!");
			num--;
			}
		}
		}
		for(int g=1; g<=n; g++) {
			result *= g;
		}
		System.out.println(result);
		}
	}

