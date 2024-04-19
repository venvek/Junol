package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] nb = new int[100];
		int idx = 0;
		
		while(true) {
			nb[idx] = sc.nextInt();
			if (nb[idx] == 0) {
				break;
			}
			//System.out.print(nb[idx] + " ");
			//idx++;
			
			for(int i=idx-1; i>=0 ; i--) {
				System.out.print(nb[i] + " ");
			}
		}
		sc.close();	
		}
	}
