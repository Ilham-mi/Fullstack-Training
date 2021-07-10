package Day06;

import java.util.Scanner;

public class FindAreaOfTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the width of the Trianle: ");
		double base = scanner.nextDouble();
		
		System.out.println("Enter the height of the Triangle: ");
		double height = scanner.nextDouble();
		
		double area = (base * height)/2;
		System.out.println("Area of Triangle is: "+area);
	}
}