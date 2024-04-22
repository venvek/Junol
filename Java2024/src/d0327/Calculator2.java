package d0327;

public class Calculator2 {
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	double areaRectangle(double width, double height, double h) {
		return width * height * h;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(4.0);
		double result2 = myCalc.areaRectangle(4.0, 6.0);
		double result3 = myCalc.areaRectangle(4.0, 6.0, 5.0);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
