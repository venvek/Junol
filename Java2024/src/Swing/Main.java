package Swing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame implements ActionListener{
	private Button b;
	
	public Main() {
		setTitle("AWT App");
		setSize(300, 100);
		
		b= new Button("OK");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
			System.out.println("ok");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.setVisible(true);
	}
}
