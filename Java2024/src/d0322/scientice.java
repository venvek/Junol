package d0322;

import java.util.Scanner;

public class scientice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if (a>0) {
			System.out.println(a);
		} else if (a<=0) {
			System.out.println("minus");	
		}
		sc.close();	
		}
	}

