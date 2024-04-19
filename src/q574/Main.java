package q574;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

	public class Main implements Comparable<Main> {
	private int num;
	
	public Main (int num) {
		this.num = num;
	}
	public int compareTo(Main other) {
		return Integer.compare(this.num, other.num);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer [] N = new Integer[3];
		for(int i=0; i<N.length; i++) {
		N[i]=sc.nextInt();
		}
		 sc.close();
		 
		 Arrays.sort(N, Comparator.reverseOrder());
		 
		 System.out.println(N[0]);
		
		 }
	}


