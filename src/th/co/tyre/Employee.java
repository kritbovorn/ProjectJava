package th.co.tyre;

public class Employee {

	public String firstName;
	public String lastName;
	private int salary;
	
	public Employee(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	// Method
	public void hello() {
		System.out.println("Hello " + firstName);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	

}
