package q530;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		
		if (age>=20) {
			System.out.println("adult");
		} else {
			System.out.print(20 - age);
			System.out.println(" years later");
	}
}
}