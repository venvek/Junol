package d0322;

public class Book {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 123;
		System.out.printf("��ǰ�� ����:%d��\n", value);
		System.out.printf("��ǰ�� ����:%6d��\n", value);
		System.out.printf("��ǰ�� ����:%-6d��\n", value);
		System.out.printf("��ǰ�� ����:%06d��\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.2f\n", 10,  area);
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
}
