package Phone;

public class PhoneExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Phone phone = new SmartPhone("È«±æµ¿");
		
		/*
		 * SmartPhone smartPhone = new SmartPhone("È«±æµ¿"); smartPhone.turnOn();
		 * smartPhone.internetSearch(); smartPhone.turnOff();
		 */
		
		Phone phone = new Phone("È«±æµ¿");
		
		Phone phone2 = new SmartPhone("ÀÓ²©Á¤");
		phone2.turnOn();
		phone2.turnOff();
		
		SmartPhone phone3 = new SmartPhone("È«±æµ¿");
		phone3.turnOn();
		phone3.internetSearch();
		phone3.turnOff();
		
	}

}
