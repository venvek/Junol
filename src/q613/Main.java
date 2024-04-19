package q613;

import java.util.Scanner;
class Infor {
	private String name;
	private String school ;
	private int grade ;
	
	/*public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;*/
	}
//	}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Infor i = new Infor();
		i.name = sc.next();
		i.school = sc.next();
		i.grade = sc.nextInt();
		
		System.out.println("Name : " + i.name);
		System.out.println("School : " + i.school);
		System.out.println("Grade : " + i.grade);
	}
}
