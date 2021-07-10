package Day06;

import java.util.Scanner;

public class FindAreaOfRectangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Length of Rectangle: ");
		double length = scanner.nextDouble();
		
		System.out.print("Enter the Width of Rectangle: ");
		double width = scanner.nextDouble();
		
		double area = length * width;
		System.out.println("Area of Rectangle is: " +area);
	}
}