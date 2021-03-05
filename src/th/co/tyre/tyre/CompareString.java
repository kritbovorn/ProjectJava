package th.co.tyre.tyre;

public class CompareString {

	public static void main(String[] args) {
		
		String str1 = "You and Me";
		String str2 = "you and me";
		
		String isEqual = str1.equals(str2) ? "มีค่าเดียวกัน" : "มีค่าไม่เหมือนกัน";
		
		System.out.println(isEqual);
	}
}
