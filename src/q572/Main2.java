package q572;

/*import java.util.Scanner;

public class Main2 {
 public double calArea(int r) {
	double area = r * r * 3.14;
	
	return area;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		System.out.println(inp);
		
		Main m = new Main();
		double area = m.calArea(inp);
		System.out.printf("%.2f",area);*/
import java.util.Scanner;

public class Main2 {

   public static void R(int r) {
      double R = 0;
      R = r * r * 3.14;
      System.out.printf("%.2f", R);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      sc.close();
      R(r);
   }

}	
