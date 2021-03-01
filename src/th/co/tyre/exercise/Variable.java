package th.co.tyre.exercise;

public class Variable {
	
	public static String myName = "Kritbovorn";	// instance variable
	
	public static void main(String[] args) {
		System.out.println("2.2 [ 1 ]");
		System.out.println("ชื่อของผม คือ :" + myName);
		
		bark();
	}
	
	public static void bark() {
		String dogName = "Japan";	// local variable
		System.out.println("The Dog name = " + dogName + " bark");
		
		System.out.println("----------------------");
		
	}
}


