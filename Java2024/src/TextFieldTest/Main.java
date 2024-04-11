package TextFieldTest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Main {
	private Frame frame;
	private Button button1;
	
	public Main() {
		button1 = new Button("login");
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void startFrame() {
	//	frame.addWindowListener(this);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("로그인 성공");
			}
			});
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Login");
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());
		Button b = new Button("login");
		b.setSize(10, 10);
		b.setLocation(10, 10);
		
		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		TextField su = new TextField(45);
		pwd.setEchoChar('*');
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(b);
		f.add(su);
		f.setVisible(true);
	Main border = new Main();
	border.startFrame();
	}
}
