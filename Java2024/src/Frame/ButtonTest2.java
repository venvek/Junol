package Frame;


import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class ButtonTest2 implements ActionListener {
		private Frame f;
		private Button b;

		public ButtonTest2 () {
			f = new Frame("Login");
			f.setSize(300, 200);
			f.setLayout(null);
			b = new Button("입력");
			b.setSize(100, 50);
			b.setLocation(100, 75);
			b.addActionListener(this);

			f.add(b);
			f.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("입력")) {
				f.setTitle("Jinsung");
			}
		}

		public static void main(String[] args) {
			new ButtonTest();
		}
	}