package TextFieldTest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Txtf {
	private Frame frame;
	private TextField tfMsg;
	private Button b;
	
	public Txtf() {
		f = new Frame("Login");
		f.setSize(400, 110);
		f.setLayout(new FlowLayout());
		
		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("PW : ", Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
