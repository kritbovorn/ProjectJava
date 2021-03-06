package th.co.tyre;

public class Employee {

	public String firstName;
	public String lastName;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	// Method
	public void hello() {
		System.out.println("Hello " + firstName);
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

	// ทำงาน
	public void work() {
		
		
	}
	
	// ลาพักร้อน
	public void vacation() {
		
		
	}
	// นินทา
	public void gossip() {
		
		
	}
	
	
	
	

}
