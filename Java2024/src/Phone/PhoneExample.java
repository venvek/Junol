package Phone;

public class PhoneExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Phone phone = new SmartPhone("ȫ�浿");
		
		/*
		 * SmartPhone smartPhone = new SmartPhone("ȫ�浿"); smartPhone.turnOn();
		 * smartPhone.internetSearch(); smartPhone.turnOff();
		 */
		
		Phone phone = new Phone("ȫ�浿");
		
		Phone phone2 = new SmartPhone("�Ӳ���");
		phone2.turnOn();
		phone2.turnOff();
		
		SmartPhone phone3 = new SmartPhone("ȫ�浿");
		phone3.turnOn();
		phone3.internetSearch();
		phone3.turnOff();
		
	}

}
