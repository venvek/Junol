package staticinner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C.D c = new C.D();
		c.field1 = 4;
		c.method1();
		System.out.println("c.field1 : " +  c.field1);
		
		c.field2 = 5;
		System.out.println("c.field2 : " + C.D.field2);	
		c.method2();
	}

}
