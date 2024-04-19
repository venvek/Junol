package q598;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
	// java style
		char inp = '\0';
		for(;;) {
			inp = sc.next().charAt(0);
			//System.out.println(inp);
			
			if(Character.isAlphabetic(inp)) {
				System.out.println(inp);
			}else if (Character.isDigit(inp)) {
				System.out.println((int)inp);
			}else {
				break;
			}
		}
	}
}
