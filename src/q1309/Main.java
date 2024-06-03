package q1309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=n;
		int g =1;
		
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
		for(g=1; g<n+1; g++) {
			if(g == 1 ) {
				break;
			}
			else if(g == 2) {
			System.out.println(g*(g-1));
			}
			
		}
		System.out.println(n*(n-1));
		}
	}

