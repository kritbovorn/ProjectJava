package th.co.tyre;

public class TestEnum {
	
	enum Status {
		CHILD,
		YOUNG,
		OLD
	}
	
	public static void main(String[] args) {
		
		
		Status myStatus = Status.YOUNG;
		
		checkStatus(myStatus);
		
	}
	
	public static void checkStatus(Status status) {
		
		Status myStatus = status;
		
		switch (myStatus) {
		case CHILD:
			System.out.println("ฉันอยู่ในช่วงอายุ ระหว่าง 1 - 18 ปี");
			break;
		case YOUNG:
			System.out.println("ฉันอยู่ในช่วงอายุ ระหว่าง 19 - 49 ปี");
			break;
		case OLD:
			System.out.println("ฉันอยู่ในช่วงอายุ ระหว่าง 50 - 120 ปี");
			break;
		}
	}
}
