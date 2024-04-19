package q540;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		for(;;) {
			int a = sc.nextInt();
			if(a%3==0)
				System.out.println(a/3);
			
		    else if(a==-1) {
				System.out.println();
			sc.close();
			break;
		
	}
}
	}
}

