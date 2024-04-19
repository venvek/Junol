package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int inp=sc.nextInt();
	    int sum=0;
	    int j = 1;
		while(j<=inp) {
			sum +=j++;
		
		}
		sc.close();
	 System.out.println(sum);
	}
}

