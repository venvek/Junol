package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String school=Jejuelementary;
		int grade=6;
		String school2=sc.next();
	    int grade2=sc.nextInt();
	    sc.close();
	/*	
	    Inf i = new Inf();
		i.school = sc.next();
		i.grade = sc.nextInt();
	*/	
		
		/* System.out.println(schoolname); 
		 * System.out.println(grade);
		 */
	    Inf st1 = new Inf(school, grade);
	/*	System.out.println("6" + " grade in Jejuelementary School");
		System.out.println(i.grade + " grade in " + i.school + " School");
	*/  st1.print();	
	
	 }     
}

class Inf {
	 /*String school;
	 int grade;
	*/
	public Inf(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	public void print() {
		System.out.println(grade + " grade in " + school 	+ " school");
		System.out.println(i.grade + " grade in " + i.school + " school");
	}
	public String getschool() {
		return school;
	}
	public void setschoolName(String schoolName) {
		this.school = school;
	}
	public int getgrade(int grade) {
		return grade;
	}
	public void setgrade(int grade) {
		this.grade = grade;
	}
}

