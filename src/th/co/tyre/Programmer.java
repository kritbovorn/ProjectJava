package th.co.tyre;

public class Programmer extends Employee {
	
	public String firstName;
	public String lastName;
	private int salary;
	
	public Programmer() {
		
	}
	
	public Programmer(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public void createWebsite(String template, String titleName) {
		
		System.out.println("สร้างเวปไซต์ โดยใช้ Template ของ " + template + "ชื่อเวปไซต์ คือ " + titleName);
	}
	
	public void installWindows(String version, String productKey) {
		
		System.out.println("สามารถ ลงโปรแกรม Window เวอร์ชั่น: " + version + " มี productKey คือ : " + productKey);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
