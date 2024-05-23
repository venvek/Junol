package b1110;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int num = sc.nextInt();
		int N=num;
		
		while(true) {
			N=(10*(N%10))+(((N/10)+(N%10))%10);
			cnt++;
		if(N == num) {
			System.out.println(cnt);
			break;
		}
	}
	}
}

