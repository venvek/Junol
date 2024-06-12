package q563;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Num = new int[10];
		for (int i = 0; i < 10; i++) {
			Num[i] = sc.nextInt();
		}

		Integer[] tmp = Arrays.stream(Num).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp, Collections.reverseOrder());
		for (int i : tmp) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}
