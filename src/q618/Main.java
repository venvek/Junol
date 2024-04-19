package q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
	private String name;
	private int height;
	private double weight;
	
	public Student(String name, int height, double weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public void print() {
		//System.out.println("name");
		System.out.println(name + " " + height + " " + weight);
		//System.out.println(" ");
		//System.out.println("weight");
		//System.out.println(name + " " + height + " " + weight);
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
		this.height=height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight= weight;
	}
	
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Arrays.sort(numAr3);
		Scanner sc = new Scanner(System.in);
		Student []st = new Student[5];
		for(int i=0; i < st.length; i++) {
			String name = sc.next();
			int height =sc.nextInt();
			double weight =sc.nextDouble();
			
		} sc.close();
		
		}
		
		Arrays.sort(st, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				int oh1 = o1.getHeight();
				int oh2 = o2.getHeight();
				
				int strlen = Math.min(name1.length(),name2.length());
				for(int i=0; i < strlen; i++) {
					if(name1.charAt(i) != name2.charAt(i)) {
						return name1.charAt(i) - name2.charAt(i);
					}
				if(oh1 < oh2)
					return 0;
				for(int i = 0; i < st.length; i++) {
			st[i].print();
			}

			
			/*
			 * Arrays.sort(intArray); list.sort(Comparator.naturalOrder());
			 * System.out.println(list);
			 * 
			 * if(weight)
			 */
		//	Student st1 = new Student(name, height, weight);
		//	st1.print();
		}
	}
}
}
