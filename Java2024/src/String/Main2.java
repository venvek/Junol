package String;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "123456-1234567";
		
		char p = ssn.charAt(7); // 7��° ���� �ν�
		
		switch (p) {
		case '1':
		case '3':
			System.out.println("���� �Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("���� �Դϴ�.");
			break;
		}
	}

}
