package Knightingale;

import java.util.Scanner;

public class Basic2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value for i...:");
		int i = scan.nextInt();
		
		System.out.print("Enter value for j..:");
		int j = scan.nextInt();
		
		System.out.println(i + "*" + j);
		
		int mul = i*j;
		
		System.out.println("The multiplication is..." + mul);
	}
}