package q1309;

import java.util.Scanner;

public class Main3 {

 public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    
    //long result = FactorialFunc(input);
    //System.out.println(result);
    
    Function2(input);
    
    
    sc.close();   
 }
 
 public static void Function2(int input)
 {
    int result = 1;
    for(int i = input; i > 0; --i)
    {
       if(i == 1)
       {
          System.out.println("1! = 1");
          result *= i;
          continue;
       }
       
       System.out.println(i +"! = " + i + " * " + (i-1) + "!");
       result *= i;
    }
    
    System.out.println(result);
 }
}
