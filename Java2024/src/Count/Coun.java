package Count;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;

public class Coun implements ActionListener{
	private Frame f;
	private Panel p;
	private TextField tf1;
	private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, 
	btp, btm, bte, btg, btn;
	
	public Coun() {
		f = new Frame("count");
		tf1 = new TextField("0");
		bt1 = new Button("1");
		bt2 = new Button("2");
		bt3 = new Button("3");
		bt4 = new Button("4");
		bt5 = new Button("5");
		bt6 = new Button("6");
		bt7 = new Button("7");
		bt8 = new Button("8");
		bt9 = new Button("9");
		bt10 = new Button("0");
		
		bt10.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);
		bt8.addActionListener(this);
		bt9.addActionListener(this);
		
		
		btp= new Button("+");
		btm= new Button("-");
		bte= new Button("=");
		btg= new Button("*");
		btn= new Button("/");	
	}
	
	public void startFrame() {
		f.setLayout(new GridLayout(4, 0));
		TextField num = new TextField(10);
		tf1 = new TextField(10);
		p.add(tf1);
		p.add(bt7);p.add(bt8);p.add(bt9);p.add(btn);
		p.add(bt4);p.add(bt5);p.add(bt6);p.add(btg);
		p.add(bt1);p.add(bt2);p.add(bt3);p.add(btm);
		p.add(btp);p.add(bt10);p.add(bte);
		
		f.setSize(250, 250);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coun coun = new Coun();
		coun.startFrame();
		
	}
}
