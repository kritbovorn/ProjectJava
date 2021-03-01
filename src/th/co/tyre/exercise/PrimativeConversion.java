package th.co.tyre.exercise;

public class PrimativeConversion {
	
	
	public static void main(String[] args) {
		
		System.out.println("2.2 [ 2: a. float -> int]");
		
		float floatNum = 9.7f;
		int intNumber = (int) floatNum;
		System.out.println("Float value : " + floatNum);
		System.out.println("Float Number : " + intNumber);
		
		System.out.println("--------");
		
		System.out.println("2.2 [ 2: b. int -> float]");
		int numInt = 200;
		float floatNumInt = (float) numInt;
		System.out.println("numInt : " + numInt);
		System.out.println("floatNumInt : " + floatNumInt);
		
		System.out.println("--------");
		
		System.out.println("2.2 [ 2: c. doube -> float]");
		double doubleNum = 3.4d;
		float floatDoubleNum = (float) doubleNum;
		System.out.println("doubleNum : " + doubleNum);
		System.out.println("floatDoubleNum : " + floatDoubleNum);
		
		System.out.println("--------");
		
		System.out.println("2.2 [ 2: d. char -> int]");
		char charactor = '7';
		int intCharactor = Character.getNumericValue(charactor);
		System.out.println("charactor : " + charactor);
		System.out.println("intCharactor : " + intCharactor);
		
		
	}
	
}
