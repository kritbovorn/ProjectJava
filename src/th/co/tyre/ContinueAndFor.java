package th.co.tyre;

public class ContinueAndFor {

	public static void main(String[] args) {
		
		int count = 20;
		
		for (int i = 1; i <= count; i++) {
			
			if (i == 11) {
				
				System.out.println("---------");
				System.out.println("Found " + i);
				System.out.println(i);
				System.out.println("---------");
				
				continue;
			}
			
			System.out.println("Wait number : 11");
		}
		
		System.out.println("------------------------");
		
		// Call method
		makeContinue();
	}
	
	
	public static void makeContinue() {
		for (int counter = 0; counter < 10; counter++) {
			if (counter == 2) continue;
			
			System.out.println("Counter: " + counter);
			System.out.println("Hello " + counter);
		}
	}
	
	
	
	
	
	
	
}
