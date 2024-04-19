package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] t = new int[10];
		
		for(int i =0;i<t.length;i++) {
			t[i]=sc.nextInt();
		}
		sc.close();
		
		for (int i =0; i < t.length; i++) {
			//System.out.print(t[i] + " ");
		}	
		int sml=1000;	
		for(int i = 0; i<t.length;i++) {
			if(sml > t[i]) {
				sml = t[i];
				}
			}
		System.out.println(sml);
		}	
	}
