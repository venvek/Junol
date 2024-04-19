package q614;

import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//String schoolname=sc.next();
	//	int grade=sc.nextInt();
	//	int a = n
		Inf i = new Inf();
		i.school = sc.next();
		i.grade = sc.nextInt();
		sc.close();
		/* System.out.println(schoolname); 
		 * System.out.println(grade);
		 */
		System.out.println("6" + " grade in Jejuelementary School");
		System.out.println(i.grade + " grade in " + i.school + " School");
	}
}

class Inf {
	String school;
	int grade;
}
