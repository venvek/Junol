package d0328ss;

	public class CellPhone {
		String model;
		String color;
		
		void powerOn() {
			System.out.println("Power On");
		}
		void poweroff() {
		System.out.println("Power On");	
		}
		
		void bell() {
			System.out.println("Bell ring");
		}
		
		void sendVoice(String message) {
			System.out.println("Send Message : " + message);
		}
		
		void receiveVoice(String message) {
			System.out.println("Receive Message : " + message);
		}
		void hangup() {
			System.out.println("Hang Up");
		}
	}
	
