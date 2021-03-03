package th.co.tyre.exercise;


public class WhileLoop {
	
	public static int i = 1, num = 10, sum = 0;

	public static void main(String[] args) {
		
		int i = 0;
		while (i <= 10) {
			System.out.println("ค่าของตัวแปร i คือ loop ครั้งที่ " + i + " คือ "  + i);
			i++;
		}
		
		System.out.println("-----------");
		
		// Call method
		sumOfNumbersForLoopMethod(num, sum);
		
		System.out.println("----------");
		
		// Call method
		sumOfNumbersWhileLoopMethod(i, num, sum);
		
		System.out.println("----------");
		
		// Call method Number % 12 == 0
		modTwelve();
		
		System.out.println("----------");
		
		// Call method For - each:
		forEachLoop();
	}
	
	// For Loop
	public static void sumOfNumbersForLoopMethod(int a, int b) {
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("Use For Loop: ผลรวม ของ 1 - 10 คือ : " + sum);
	}
	
	// While Loop
	public static void sumOfNumbersWhileLoopMethod(int initial, int target, int sum) {
		
		while  (initial <= target) {
			sum += initial;
			initial++;
		}
		
		System.out.println("Use While Loop: ผลรวม ของ 1 - 10 คือ : " + sum);
	}
	
	// Modular 12 == 0
	public static void modTwelve() { 
		
		int index = 1;
		
		for (int i = 1; i <= 100; i++) {
			
			
			if (i % 12 == 0) {
				
				System.out.println(index + "ตัวเลข ระหว่าง 1 - 100 ที่หาร 12 ได้ลงตัว คือ " + i);
				
			}
			
		}
	}
	
	//
	public static void forEachLoop() {
		int num[] = { 1, 2, 3, 4, 5 };
		
		for (int log : num) {
			System.out.println("ใน Array มีค่า : " + log + " โดยใช้ For-each ในการ loop");
		}
	}
	
	
}












