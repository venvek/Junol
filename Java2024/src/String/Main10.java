package String;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-Simon";
		
		String[]names = text.split("&|,|=");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
