package th.co.tyre;

public class Programmer extends Employee {
	
	
	public void createWebsite(String template, String titleName) {
		
		System.out.println("สร้างเวปไซต์ โดยใช้ Template ของ " + template + "ชื่อเวปไซต์ คือ " + titleName);
	}
	
	public void installWindows(String version, String productKey) {
		
		System.out.println("สามารถ ลงโปรแกรม Window เวอร์ชั่น: " + version + " มี productKey คือ : " + productKey);
	}
}
