package th.co.tyre.tyre;

public class CharToString {
	
	public static void main(String[] args) {
		
		char[] charactors = { 'K', 'r', 'i', 't', 'b', 'o', 'v', 'o', 'r', 'n', ' ', 'T', 'a', 'w', 'e', 'e', 'y', 'o', 's', 's', 'a', 'k' };
		
		// Method 1
		convertCharToStringOne(charactors);
		
		// Method 2
		convertCharToStringTwo(charactors);
		
	}
	
	// Method 1
	public static String convertCharToStringOne(char[] charactors) {
		
		String str = String.valueOf(charactors);
		
		System.out.println(str);
		return str;
	}
	
	// Method 2
	public static void convertCharToStringTwo(char[] charactors) {
		
		String str = String.copyValueOf(charactors, 0, charactors.length);
		System.out.println(str);
	}
}
