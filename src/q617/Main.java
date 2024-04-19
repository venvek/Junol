package q617;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[5];
		for (int i = 0; i < st.length; i++) {
			String name = sc.next();
			 int height = sc.nextInt();
		//	 student[i] = new Student();
			
			/*int[] intArray = new int[5];
			Arrays.sort(intArray);
			for (int i1 : intArray) {
				System.out.print(i1[0]);*/
				}

		}
		student [i] = new Student(name, height);
		student.print();
		
	}

class Student {
	private String name;
	private int height;

	public Student(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public void print() {
		System.out.println(name + " " + height);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}