package String;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "   4567    ";
		String tel4 = "  4 5 6  7  ";
		
		System.out.println(tel1 + tel2 + tel3);
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
		System.out.println(tel4.trim());
	}
}
