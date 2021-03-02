package th.co.tyre.exercise;

public class CheckGrade {
	
	public static void main(String[] args) {
		
		int grade = 32;
		String gradePoint = "";
		
		switch (grade) {
		case 80:
			gradePoint = "เกรด A";
			break;
		case 70:
			gradePoint = "เกรด B";
			break;
		case 60:
			gradePoint = "เกรด C";
			break;
		case 50:
			gradePoint = "เกรด D";
			break;
		case 40:
			gradePoint = "เกรด F";
			break;
		default:
			gradePoint = "เกรด E";
				
		}
		System.out.println(gradePoint);
	}

}
