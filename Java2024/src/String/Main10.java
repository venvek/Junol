package String;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "È«±æµ¿&ÀÌ¼öÈ«,¹Ú¿¬¼ö,±èÀÚ¹Ù-Simon";
		
		String[]names = text.split("&|,|=");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
