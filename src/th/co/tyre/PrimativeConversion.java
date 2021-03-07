package th.co.tyre;

public class PrimativeConversion {
	
	public static void main(String[] args) {
		
		int myInt = 5;
		float myFloat = myInt;
		System.out.println("MyInt value is: " + myInt);
		System.out.println("MyFloat value is: " + myFloat);
		
		System.out.println("\n");
		
		float newFloat = 5.5f;
		int newInt = (int)newFloat;
		System.out.println("NewFloat value is " + newFloat);
		System.out.println("NewInt value is " + newInt);
		
		System.out.println("\n");
		
		int otherInt = 130;
		byte myByte = (byte)otherInt;
		System.out.println("Other value is " + otherInt);
		System.out.println("MyByte value is " + myByte);
	}

}
