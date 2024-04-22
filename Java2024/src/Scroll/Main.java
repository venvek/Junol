package Scroll;

import java.awt.Frame;
import java.awt.Scrollbar;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Comments");
		f.setSize(300, 200);
		f.setLayout(null);
		
		Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0, 100);
		hor.setSize(100, 15);
		hor.setLocation(60, 30);
		
		Scrollbar ver = new Scrollbar(Scrollbar.HORIZONTAL, 50, 20, 0, 100);
		hor.setSize(15, 100);
		hor.setLocation(30, 30);
		
		f.add(hor);
		f.add(ver);
		f.setVisible(true);
	}
}
