package Treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<E> ts = new HashSet();
		
		if (ts.add("korea")) {
			System.out.println("ù ��° korea �߰� ����");
		} else {
			System.out.println("ù ��° korea �߰� ����");
		}
		
		if (ts.add("china")) {
			    System.out.println("ù ��° china �߰� ����");
	    } else {
	    		System.out.println("ù ��° china �߰� ����");	
	    		
	    }if (ts.add("america")) {
		System.out.println("ù ��° america �߰� ����");
		} else {
		System.out.println("ù ��° america �߰� ����");	
		}
	    
		if (ts.add("china")) {
		System.out.println("ù ��° america �߰� ����");
		} else {
		System.out.println("ù ��° america �߰� ����");	
		
		System.out.println("Iterator�� ��ü ���� ��ȭ -------");
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		}
	}
}
