package ArrayList;

import java.util.Arrays;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("�����", "�ߺ�", "���", "������");
		for (String name : list1) {
			System.out.print(name + " ");
		}
		System.out.println();
	    list1.add(2, "����");   // Exception
		
		List<Integer> list2 = Arrays.asList(4, 3, 8, 1, 9, 12);
		for(int value : list2) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
