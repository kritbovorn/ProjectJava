package th.co.tyre;

public class Ceo extends Employee {
	
	public String firstName;
	public String lastName;
	private int salary;
	
	public Ceo() {
		
	}
	
	public Ceo(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public void seminar() {
		
		System.out.println("มีต้องไป สัมมนาที่ต่างจังหวัด");
	}
	
	public void hire() {
		
		System.out.println("รับสมัคร พนักงานใหม่ ");
	}
	
	public void fire() {
		
		System.out.println("ไล่พนักงานออก");
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
