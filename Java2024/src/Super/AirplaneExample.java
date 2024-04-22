package Super;

public class AirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperAirplane sa = new SuperAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperAirplane.SUPER;
		sa.fly();
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
