package th.co.tyre.tyre;

public class CharToString {
	
	public static void main(String[] args) {
		
		char[] charactors = { 'K', 'r', 'i', 't', 'b', 'o', 'v', 'o', 'r', 'n', ' ', 'T', 'a', 'w', 'e', 'e', 'y', 'o', 's', 's', 'a', 'k' };
		
		// Method 1
		convertCharToStringOne(charactors);
		
		// Method 2
		convertCharToStringTwo(charactors);
		
		// Method 3
		System.out.println(toString(charactors));
		
		// Method 4
		System.out.println(useStringBuilderClass(charactors));
		
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
	
	// Method 3
	
	public static String toString(char[] charactors) {
		
		String str = new String(charactors);
		
		return str;
	}
	
	// Method 4
	public static String useStringBuilderClass(char[] charactors) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < charactors.length; i++) {
			stringBuilder.append(charactors[i]);
		}
		
		
		return stringBuilder.toString();
	}
}
