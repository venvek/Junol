package q558;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] put= new int[100];
		int idx = 0;
		for(;;) {
				put[idx] = sc.nextInt();
				if(put[idx] == 0) {
					break;
				}
				System.out.print(put[idx] + " ");
				idx++;
		}
		sc.close();
	}
}
