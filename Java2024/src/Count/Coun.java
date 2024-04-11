package Count;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class Coun {
	private Frame f;
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
		f.add(tf1);
		f.add(bt7);f.add(bt8);f.add(bt9);f.add(btn);
		f.add(bt4);f.add(bt5);f.add(bt6);f.add(btg);
		f.add(bt1);f.add(bt2);f.add(bt3);f.add(btm);
		f.add(btp);f.add(bt10);f.add(bte);
		
		f.setSize(250, 250);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coun coun = new Coun();
		coun.startFrame();
		
	}
}
