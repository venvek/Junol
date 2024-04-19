package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt1 =0, cnt2=0;
		for(;;) {
			int a = sc.nextInt();
		}	if(a%2==0) {
			cnt2++;
			break;
		}	else if (a%2==1) {
			cnt1++;
			break;
		}
			else if (a==0) {
			sc.close();
			break;
	
		}	System.out.println("odd : " + cnt1);
		  System.out.println("even : " + cnt2 );
		} 
		
	}

