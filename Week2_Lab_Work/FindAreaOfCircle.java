package Day06;

import java.util.Scanner;

class FindAreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Radius: ");
		double radius = scanner.nextDouble();
		
		double area = Math.PI * (radius * radius);
		System.out.println("The area of Circle is: "+ area);
		
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of the Circle is: "+ circumference);
	}
}