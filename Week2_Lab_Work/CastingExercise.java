package Knightingale;

public class CastingExercise {
	public static void main (String[] args) {
	
		byte b=10; 
		
		int i=b;// will accept - automatic type promotion
		byte c=i;// will not accept - higher type cannot assign lower type
		
		byte d=(byte)i;// Type casting makes it possible to store compatible types
		
		byte x=10;
		byte y=20;
		
		byte sum=x*y;//Error throw bcz when to byte are used in arithmetic operation, the result will be integer
		
	}
}