package q1341;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String s1=sc.next();
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		while(true) {
		
            if((s >= 2 && e <= 9) && (s >= 2 && e <= 9)) break;
            else {
                System.out.println("INPUT ERROR!");
            }
        }
	     if(s < e) {
	            for(int i = 1; i <= 9; i++) {
	                for(int j = s; j <= e; j++) {
	                    System.out.printf("%d * %d = %2d", j, i , j*i);
	                    System.out.print("   ");
	                    if(i % 3 == 0 ) {
	                    	System.out.println("   ");
	                }
	                }
	 
	            }
	        } else {
	            for(int i = 1; i <= 9; i++) {
	                for(int j = s; j >= e; j--) {
	                    System.out.printf("%d * %d = %2d", j, i , j*i);
	                    System.out.print("   ");
	                    if(i % 3 == 0 ) { 
	                    	System.out.println("   ");
	                }
	                
					/*
					 * for(int i=1; i<10; i++) { System.out.printf(S+ " * " +i + " =");
					 * System.out.printf("%3d",S*i); System.out.print("   ");
					 * 
					 * if(i % 3 == 0) { System.out.println(" "); } } System.out.println(" ");
					 * for(int i=1; i<10; i++) { System.out.printf(E+ " * " +i + " =");
					 * System.out.printf("%3d",E*i); System.out.print("   "); if(i % 3 == 0) {
					 * System.out.println(" ");
					 */
		}
	}
	}
	}}

