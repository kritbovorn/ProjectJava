package th.co.tyre.exercise;

public class CheckGrade {
	
	public static void main(String[] args) {
		
		boolean isHandSome = true;
		int score = 57;
		
		if (isHandSome) {
			System.out.println("Good");
		} else {
			if (score >= 80) {
				System.out.println("Good");
			}else if ((score >= 50) && (score < 80)){
				System.out.println("normal");
			}else if (score < 50) {
				System.out.println("failed");
			}
		}
	}

}
