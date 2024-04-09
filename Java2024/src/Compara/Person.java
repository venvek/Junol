package Compara;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println(name + ":" + age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Person arg0) {
		if (age < arg0.age)
			return -1;
		else if (age == arg0.age)
			return 0;
		else
			return 1;
	}

}
