package q615;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[2];
		for(int i=0; i < st.length; i++) {
		String name = sc.next();
		int enscore = sc.nextInt();
		int koscore = sc.nextInt();
		
		Student st1 = new Student(name, enscore, koscore);
		st1.print();
		
	//	int sumKor = 0, sumEng =0;
	//	for(int i =0; i<st.length; i++) {
	//		sumKor += stu[i],getKor();
	//		sumEng += stu[i],getEng();
		}
	}
}

class Student {
	private String name;
	private int enscore;
	private int koscore;

	public Student(String name, int enscore, int koscore) {
		this.name = name;
		this.enscore = enscore;
		this.koscore = koscore;
	}

	public void print() {
	System.out.println(name + " " + enscore + " " + koscore);
//	System.out.println(name + " " + enscore + " " + koscore);
	System.out.println("avg " + enscore/2 + " " + koscore/2);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnscore() {
		return enscore;
	}

	public void setEnscore(int score) {
		this.enscore = enscore;
	}
	public int getKocore() {
		return koscore;
	}

	public void setKscore(int score) {
		this.koscore = koscore;
	}
}
