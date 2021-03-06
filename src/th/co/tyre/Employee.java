package th.co.tyre;

public class Employee {

	public String firstName;
	public String lastName;
	private int salary;
	
	// 13.2 [ 1 ]
	public String position;
	
	// Constructor
	public Employee() {
		
	}
	// Constructor 4 parameters
	public Employee(String firstName, String lastName, int salary, String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.position = position;
	}
	// Constructor 3 parameters
	public Employee(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	// Constructor 2 parameters
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	// Main	: 13.2 [ 3.1 ]
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Kritbovorn", "Taweeyossak", 10_000, "Developer");	// 13.2 [ 3.2 ]
		employee1.checkPosition();	// 13.2 [ 3.3 ]
		System.out.println(employee1.getFullname(employee1.firstName, employee1.lastName));
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
	
	//  13.2 [ 2 ]
	public void checkPosition() {
		
		System.out.println("My position is " + position);
	}
	
	// Method : Get Full name
	public String getFullname(String firstName, String lastName) {
		
		String fullname = "ชื่อนามสกุลเต็ม ของคุณคือ " + firstName + " " + lastName;
		
		return fullname;
	}
	
	
	
	

}
