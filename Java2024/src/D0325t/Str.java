package D0325t;

import d0325.String;

public class Str {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "JBEdu";
		String strVar2 = "JBEdu";
		
		if(strVar1 == strVar2) {
			System.out.println("참조가 같음");
		}else {
			System.out.println("참조가 다른");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("두 문자열이 같음");
		}
		
		String strVar3 = new String("JBEdu");
		String strVar4 = new String("JBEdu");
		
		if(strVar3 == strVar4) {
			System.out.println("참조가 같음");
		}else {
			System.out.println("참조가 다른");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("두 문자열이 같음");
	}
}
