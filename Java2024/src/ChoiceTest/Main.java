package ChoiceTest;

import java.awt.Frame;
import java.awt.Choice;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Choice = Select");
		f.setSize(300, 200);
		f.setLayout(null);
		
		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		day.setSize(100, 50);
		day.setLocation(100, 70);
		
		f.add(day);
		f.setVisible(true);
	}
}
