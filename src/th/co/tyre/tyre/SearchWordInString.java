package th.co.tyre.tyre;
import java.util.Scanner;

public class SearchWordInString {
	
	public static void main(String[] args) {
		
		searchWord();
	}
	
	// Method
	public static void searchWord() {
		
		Scanner scanner = new Scanner(System.in);

		boolean isFound = true;
		
		String paragraph = "I am study Java programming language, it's so difficult very much";
		String inputWord = "";
		
		while (isFound) {
			
			System.out.println(paragraph);
			System.out.println("กรุณาเลือก คำใน ประโยคด้านบนนี้ แล้ว พิมพ์ ส่งเข้ามานะคะ");
			
			String foundString = scanner.next();
			
			isFound = paragraph.contains(foundString);
			inputWord = isFound ? "ท่านกรอก " + foundString + " เข้ามา" : "ท่านกรอกมาไม่ถูกต้อง";
			
			System.out.println(inputWord);
			System.out.println("-----");
		
		}

		System.out.println("Oops!!! : เสียใจด้วย ท่านกรอกมาไม่ถุกต้อง");
		System.out.print("-----------------------");
		
		scanner.close();
	}

}
