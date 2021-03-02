package th.co.tyre.exercise;

public class Unary {
	
	public static void main(String[] args) {
		
		System.out.println("3.1 [ a ]");
		
		int iPlusSuffix = 20;
		
		System.out.println(iPlusSuffix++);	// 20
		System.out.println(iPlusSuffix++);	// 21
		System.out.println(iPlusSuffix++);	// 22
		System.out.println(iPlusSuffix++); 	// 23
		System.out.println(iPlusSuffix++);	// 24
		
		System.out.println("----------");
		
		int plusSuffix = 20;
		plusSuffix++;	// 20
		plusSuffix++;	// 21
		plusSuffix++;	// 22
		plusSuffix++;	// 23
		plusSuffix++;	// 24
		System.out.println(plusSuffix);		// 25
		
		System.out.println("--------------------");
		
		System.out.println("3.1 [ b ]");
		
		int iMinusPrefix = 20;
		
		System.out.println(--iMinusPrefix);	// 19
		System.out.println(--iMinusPrefix);	// 18
		System.out.println(--iMinusPrefix);	// 17
		System.out.println(--iMinusPrefix);	// 16
		System.out.println(--iMinusPrefix);	// 15
		
		System.out.println("----------");
		
		int minusPrefix = 20;
		--minusPrefix;	// 19
		--minusPrefix;	// 18
		--minusPrefix;	// 17
		--minusPrefix;	// 16
		--minusPrefix;	// 15
		
		System.out.println(--minusPrefix);	// 14
		
		System.out.println("--------------------");
		
	}
}
