package q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); 
		int m =	sc.nextInt(); 
		int num=1;
		for (int i =0; i<m; i++) {
			if (i % 2 == 0 ) {
				if(i != 0) {
					num += m +1; 
				}
				for(int j=0; j<m; j++) {
					System.out.print(num++ + " ");
				}	
		}else {
			num += m -1;
					for(int j=0; j<m; j++) {
						System.out.print(num-- + " ");
					}
				}	
			}
		}
}