package b1152;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);
    String inputString_00 = scanner.nextLine();
    inputString_00 = inputString_00.trim();
    if(inputString_00.isEmpty())
    {
        System.out.println(0);
        return;            
    }

    String[] splitStr = inputString_00.split("\\s+");
    System.out.println(splitStr.length);
    
    scanner.close();
}
}

