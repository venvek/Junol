package q555;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char[] charr = new char[10];
		for(int i=0; i<charr.length; i++) {
			charr[i] = s.next().charAt(0);
		}
		s.close();
		
		for(int i = 0; i < charr.length; i++) {
		System.out.println(charr[i] + " ");
	}
}
}