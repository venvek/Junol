package Exception;

public class ArrayIndexOutOfBoundsExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.print("args[0] : " + data1);
			System.out.print("args[1] : " + data2);			
		}	else {
			System.out.println("[���� ���]");
			System.out.println("java ArrayOutOfBoundsExceptionExample ");
			System.out.println("��1 ��2");
		}
	}

}
