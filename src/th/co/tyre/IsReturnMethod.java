package th.co.tyre;

import java.util.Scanner;

public class IsReturnMethod {
	
	public static void main(String[] args) {
		
		Scanner yourName = new Scanner(System.in);
		Scanner yourSurname = new Scanner(System.in);
		
		
		
		
		System.out.print("กรุณากรอก ชื่อของท่าน: ");
		String inputName = yourName.next();
		
		System.out.print("กรุณากรอก นามสกุลของท่าน: ");
		String inputSurname = yourSurname.next();
		
		// Call method
		System.out.print("ยินดีต้อนรับ คุณ " + yourNameIs(inputName) + " ");
		yourSurnameIs(inputSurname);
	}
	
	public static String yourNameIs(String name) {
		return name;
	}
	
	public static void yourSurnameIs(String surname) {
		System.out.print(surname);
	}

}
