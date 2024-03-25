package d0325;

public class WhileExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			
			if(i == 9) {
				break;
			}
	    }
	}
}