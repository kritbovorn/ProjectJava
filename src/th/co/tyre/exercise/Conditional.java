package th.co.tyre.exercise;

public class Conditional {
	
	public static void main(String[] args) {
		
		float floatNumOne = 11.1f;
		float floatNumTwo = 22.2f;
		
		char charactor = 'A';
		
		if ((floatNumOne == 11.1) && (floatNumTwo == 22.2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		// Output :  False
		
		if ((charactor == '\u0041') || (charactor == 'a')) {  //  จริง || เท็จ =   จริง
			System.out.println("True");
		}
		
		// Output : True
		
	}
	
	

}
