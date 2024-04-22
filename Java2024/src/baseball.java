import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class baseball {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] selectNumber = new int[3];
		Random random = new Random(9);

		while (true) {
			for (int i = 0; i < selectNumber.length; i++) {
				selectNumber[i] = random.nextInt(9);
			}
			Arrays.sort(selectNumber);
			boolean eq = false;
			for (int i = 0; i < selectNumber.length - 1; i++) {
				if (selectNumber[i] == selectNumber[i + 1]) {
					eq = true;
					break;
				} else {
					eq = false;
				}
			}
			if (eq == false) {
				break;
			}
		}
		for (int i = 0; i < 3; i++) {
			selectNumber[i] = random.nextInt(9) + 1;
			System.out.print(selectNumber[i]);
			// for(;;) {
		
			int[] winningNumber = new int[3];
			random = new Random(3);
			System.out.println("´çÃ· ¹øÈ£ : ");
			for(int i1 = 0; i1 < 3; i1++) {
				winningNumber[i1] = random.nextInt(9);
				System.out.print(winningNumber[i1] + " ");				
			}
			System.out.println();
	//´çÃ·¿©ºÎ	
			Arrays.sort(selectNumber);
			Arrays.sort(winningNumber);
			boolean result = Arrays.equals(selectNumber, winningNumber);
			System.out.println("´çÃ· ¿©ºÎ ");
			if (result) {
				System.out.println("Game Over!!!");
			} //else if ()
			}
	}
//}
}