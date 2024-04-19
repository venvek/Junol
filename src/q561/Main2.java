package q561;

import java.util.Scanner;

public class Main2 {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int [] N = new int[10]; 
      for(int i=0;i<N.length;i++) {
         N[i]=sc.nextInt();
      }
      sc.close();
      for(int i =0; i < N.length; i++) {
   //   System.out.println(N[i]);
      }
      int g = 99;
      for(int i=0; i<N.length; i++) {
         if(g < N[i] && N[i] < 100) {
            g = N[i];
         }
      }
      System.out.print(g);
      
      int h = 101;
      for(int i=0; i<N.length; i++) {
         if(h > N[i] && N[i] >= 100) {
            h = N[i];
         }
      }
      System.out.print(" " + h);
      }
}