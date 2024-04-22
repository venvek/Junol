package q128;

import java.util.Scanner;
public class Suc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int count = 0;
 
        while (true){
            num = sc.nextInt();
            if (num != 0) {
                if ((num%3) == 0)
                    continue;
                else if ((num%5) == 0)
                    continue;
                else
                    count++;
            }
            else
                break;
        }
 
        System.out.println(count);
 
    }
}