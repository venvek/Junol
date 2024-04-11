package Frame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest {
	/*
	 * private Frame frame; private Button btn1;
	 * 
	 * public ButtonTest() { frame = new Frame("Login"); btn1 = new Button("확인"); }
	 * 
	 * public void startFrame() { btn1.addActionListener(new ActionListener() {
	 * public void actionPerformed(ActionEvent arg0) { System.out.println("jinsung);
	 * } }); }
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		Button b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100, 75);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setTitle("jintjd");
			}
		});
		f.add(b);
		f.setVisible(true);
	}
}
