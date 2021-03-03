package th.co.tyre.exercise;

public class BreakAndFor {
	
	public static void main(String[] args) {
		
		int count = 20;
		
		for (int i = 0; i <= count; i++) {
			
			if (i == 11) {
				System.out.println(i);
				
				break;
			}
			
			System.out.println(i);
		}
	}
}
