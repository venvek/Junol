package q555;

import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		//System.out.println(input)()
		for(int i =0; i < input.length();i++){
			if(input.charAt(i) ==' ')
				continue;
			
			System.out.print(input.charAt(i));
		}
		System.out.println();
		//System.out.print(input.replaceAll(" ", ""));
	}
}
