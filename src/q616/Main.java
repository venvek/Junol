package q616;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * int x1 = sc.nextInt(); int y1 = sc.nextInt(); int x2 = sc.nextInt(); int y2 =
		 * sc.nextInt(); int x3 = sc.nextInt(); int y3 = sc.nextInt(); double xcenter =
		 * (double)(x1+x2+x3)/3; double ycenter = (double)(y1+y2+y3)/3;
		 * System.out.printf("(" + "%2f"+xcenter+ ", " ); System.out.printf(ycenter
		 * +")");
		 */
	} 
}

class Triangle { 
	private int x1,x2,x3,y1,y2,y3;
	private double xcenter ;
	private double ycenter ;
	
	public Triangle(int x1,int x2,int x3,int y1,int y2,int y3, double xcenter, double ycenter) {
		this.x1 =x1;
		this.x2 =x2;
		this.x3 =x3;
		this.y1 =y1;
		this.y2 =y2;
		this.y3 =y3;
		this.xcenter=xcenter;
		this.ycenter=ycenter;
	}
	public void print() {
		System.out.println("(" + xcenter + ", " + ycenter+ ")" );
		
	}
	public void setName(int x1) {
		this.x1 = x1;
	}
}
