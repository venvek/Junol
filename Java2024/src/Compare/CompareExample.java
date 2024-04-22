package Compare;

import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);
		
		int result = Objects.compare(s1, s2,  new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3,  new StudentComparator());
		System.out.println(result);
		
	}

}
