package th.co.tyre.exercise;

public class CheckGrade {
	
	public static void main(String[] args) {
		
		int grade = 70;
		
		switch (grade) {
		case 80:
			System.out.println("เกรด A");
			break;
		case 70:
			System.out.println("เกรด B");
			break;
		case 60:
			System.out.println("เกรด C");
			break;
		case 50:
			System.out.println("เกรด D");
			break;
		case 40:
			System.out.println("เกรด F");
			break;
		default:
			System.out.println("เกรด E");
				
		}
	}

}
