package th.co.tyre;


public class Application {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		
		employees[0] = new Employee("สมขาย", "แมนแมน", 10_000);
		employees[1] = new Employee("นางฟ้า", "สุดสวย", 100_000);
		employees[2] = new Employee("ไทย", "ไทยแลนด์", 15_000);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("สมาชิกท่านที่ " + (i + 1) + " : " + employees[i].firstName + " " + employees[i].lastName + " มีเงินเดือน = " + employees[i].getSalary());
			System.out.println();
		}
		System.out.println();
		
		System.out.println("---------- Ceo ทำอะไรได้บ้าง \n");
		Ceo ceo = new Ceo();
		ceo.fire();
		ceo.seminar();
		ceo.hire();
		
		System.out.println("\n ------------------ Programmer \n");
		
		Programmer programmer = new Programmer();
		programmer.getSalary();
		programmer.createWebsite("Angular", "ขายสินค้าราคาถูก ถูก");
		programmer.installWindows("Version 10", "12345-abcde-54321-fghij-klmnop");
		programmer.getSalary();
		
		System.out.println("\n -------------- ทดสอบ Constructor Overloading \n");
		
		Employee constructorOverloadingEmployee = new Employee("นาย ก", "เป็นคนไทย");
		System.out.println(constructorOverloadingEmployee.firstName + " " + constructorOverloadingEmployee.lastName);
		
	}
	
	
}
