package th.co.tyre;

public class TwoDimensionArray {
	
	public static void main(String[] args) {
		
		int[][] twoDimensionArray = {
				{1, 2, 3},
				{4, 5, 6, 7},
				{8, 6, 9, 1, 9},
				{33, 44, 55, 66, 88, 11}
		};
		
		//
		loopArray(twoDimensionArray);
		
		System.out.println("--------------");
				
		//
		foreachLoop(twoDimensionArray);
	}
	
	//
	public static void loopArray(int[][] intArray) {
		
		int sum = 0;
		
		for (int row = 0; row < intArray.length; row++) {
			for (int col = 0; col < intArray[row].length; col++) {
				
				System.out.print(intArray[row][col] + "\t");
				
			}
			System.out.println();
			
			sum += intArray[row][intArray[row].length - 1];
			
		}
		System.out.println("ผลรวม ของ จำนวน index สุดท้ายของแต่ ละ Row คือ " + sum);
	}
	
	public static void foreachLoop(int[][] intArray) {
		
		int sum = 0;
		
		for (int[] row : intArray) {
			for (int col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
			
			sum += row[row.length - 1];
		}
		System.out.println("ผลรวม ของ จำนวน index สุดท้ายของแต่ ละ Row คือ " + sum);
		
	}

}
