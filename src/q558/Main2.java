package q558;

import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] nb = new int[100];
		int idx = 0;
		
		for(;;) {
				nb[idx] = sc.nextInt();
				if(nb[idx] == 0) {
				break;
		}
					System.out.print(nb[idx] + " ");
					idx++;
			}
			sc.close();
			}
		}
	

