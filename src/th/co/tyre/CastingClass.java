package th.co.tyre;

import java.util.ArrayList;

public class CastingClass {
	
	public static void main(String[] args) {
		
		Employee dang = new Employee("Dang", "Red", 10000);
		Employee ceo = new Ceo("Captain", "Marvel", 20000);
		
		Programmer programmer = new Programmer("Captain", "Marvel", 20000);
		
		Ceo ceo2 = (Ceo) ceo;
//		Ceo ceo3 = new Employee("Captain", "Marvel", 30000);
//		Ceo ceo4 = (Ceo) dang;
		ArrayList<Employee> myList = new ArrayList<>();
		myList.add(ceo2);
		myList.add(dang);
		myList.add(programmer);
		Ceo ceo3 = (Ceo) myList.get(0);
		Employee dang2 = myList.get(1);
		Programmer programmer2 = (Programmer) myList.get(2);
		ceo3.hello();
		programmer2.hello();
		dang2.hello();
		
	}

}
