package th.co.tyre;

public final class FinalClass {
	
	static final int speedLimit = 120;

	public static void main(String[] args) {
		
		drive();
		System.out.println("Oops !!! : ขับรถได้ด้วยความเร็วไม่เกิน " + speedLimit + "/ชั่วโมง");

	}
	
	static final void drive() {
		System.out.println("ฉันขับรถอยู่บนทางด่วน");
	}

}
