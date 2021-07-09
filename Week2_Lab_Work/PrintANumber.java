package Knightingale;

import java.util.Scanner;

public class PrintANumber {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a Number:");
		
		int Number = reader.nextInt();
		System.out.println("You entered is:" + Number);
	}
}