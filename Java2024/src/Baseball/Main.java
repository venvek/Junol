package Baseball;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[] rnd = new int[3];
		
		boolean b = true;
		do {
			b=false;
	      for (int i = 0; i < rnd.length; i++) {
	         rnd[i] = random.nextInt(9) + 1;
	}
	      if(rnd[0]== rnd[1]|| rnd[1]== rnd[2] || rnd[2] == rnd[0] ) {
	      b= true;
	      }
		}while (b);
		
		
	      for(int i = 0; i < rnd.length; i++) {
	    	  System.out.print(rnd[i] + " ");
	      }
	      int [] inp = new int[3];
	      boolean bGO = false;
	      int stk=0, ball=0;
	      do {
	    	  stk=0;
	    	  ball=0;
	    	  System.out.print("Input number...");
	    	  for(int i = 0; i < inp.length; i++) {
	    		  inp[i] = sc.nextInt();
	    	  }
	      }while(bGO);

}
}
