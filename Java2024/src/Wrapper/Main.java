package Wrapper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		Integer obj4 = 100;
		
		int value1 = obj1.intvalue();
		int value2 = obj2.intvalue();
		int value3 = obj3.intvalue();
		int value3 = obj4.intvalue();
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
