package q128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		for(;;) {
			int rp = sc.nextInt();
			if(rp % 3 == 0) {
				
			}else if(rp % 5 == 0) {
			
			}else if(rp == 0){
				break;
			}else {	
				sum++;	
			}System.out.println(sum);	
		}System.out.println(sum);
		
	}
}
