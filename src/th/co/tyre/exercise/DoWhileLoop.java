package th.co.tyre.exercise;
import java.util.Scanner;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		System.out.println("Lab 7. Do While Loop [ 1 ]");
		
		int counter = 20;
		
		do {
			System.out.println("Counter: " + counter);
			counter--;
		} while (counter >= 0);
		
		System.out.println("----------");
		
		// ### Call Method isEvenNumber()
		
		System.out.println("Lab 7. Do While Loop [ 2 ]");
		isEvenNumber();
		
	}
	
	// Method :   
	public static void isEvenNumber() {
		
		Scanner scanner = new Scanner(System.in);	// เรียกใช้ Class Scanner แต่ต้องไป import บรรทัดที่ 2: มาก่อน
		boolean isEven = true;						// ประกาศตัวแปร เพื่อมาเก็บค่า เงื่อนไข ว่าจริงหรือเท็จ แล้วไปเรียกใช้ที่ While loop
		
		while (isEven) {
			
			System.out.print("กรุณากรอกตัวเลขที่เป็น เลขคู่ : ");	// print ความต้องการ เพื่อสื่อสารกับ Users ว่าเราต้องการ ให้กรอก อะไร เข้ามา
			
			int input = scanner.nextInt();
			isEven = (input % 2 == 0);		// เอาตัวแปร isEven มารับค่า ถ้า เป็นเลขคู่ ให้กับไปที่ while loop ทำซ้ำ จนกว่าจะเป็นเลขคี่
		}
		scanner.close();					//  $$$$$ สำคัญ เมื่อเรียกใช้ ก็ควร ปิด การเรียกใช้ Scanner
		
		System.out.println("Oops!!! : คุณกรอกตัวเลขที่เป็นเลขคี่ เข้ามา");

	}
}
