package q539;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum =0, cnt=0;
		for(;;) {
			int inp = sc.nextInt();
			cnt++;
			sum +=inp;
			//		System.out.print(inp + " ");
			if(inp >= 100) {
				sc.close();
				break;				
	}
	}
		System.out.println(sum);
	//	System.out.println((double)sum/cnt);
		System.out.printf("%.1f\n",(double)sum/cnt);
}
}