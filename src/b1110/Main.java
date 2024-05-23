package b1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		int cnt=0;
		int[] Num = new int[2];
		int Num1 = 0;
		Scanner sc = new Scanner(System.in);
		for(i=0; i<Num.length; i++) {
			Num[i] = sc.nextInt();
			if (Num[0]+ Num[1]<10) {
				System.out.println((Num[1]*10)+Num[0]+Num[1]);
				Num1 = (Num[1]*10)+Num[0]+Num[1];
			}
			else if(Num[0]+ Num[1]>10) {
				System.out.println((Num[1])*10+(Num[1]+Num[0])%10);
				Num1 = (Num[1])*10+(Num[1]+Num[0])%10;
			}System.out.println(Num1);
		}	cnt++; 
		System.out.println(cnt);
		  for(;;) 
			  if(Num[0]+Num[1]<10) { 
				  Num1=(Num[1]*10)+Num[0]+Num[1];
				  cnt++;
			 } else if(Num[0]+Num[1]>10) {
				  Num1=(Num[1])*10+(Num[1]+Num[0])%10; 
				  cnt++;
			 } 
		 
		 
	}
	}
		
	

