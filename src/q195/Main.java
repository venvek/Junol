package q195;

import java.util.Scanner;

class Person {
	private String name;
	private String tel;
	private String addr;
	
	public Person(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}
	
	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();	
		String addr = sc.next();	
		
		Person p1 = new Person(name, tel, addr);
		p1.print();
	}
}

