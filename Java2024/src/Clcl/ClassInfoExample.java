package Clcl;

import Car.Car;

public class ClassInfoExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(100);
		Class clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
	}

}
