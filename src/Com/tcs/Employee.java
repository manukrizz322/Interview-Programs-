package Com.tcs;

public class Employee {
	private Employee() {//non parameterized constructor
		System.out.println("I am a constructor");
	}
	private Employee(int id) {
		//parameterized constructor
		System.out.println("Employee Id is"+id);
	}

	private void employeeName(String a) {
		System.out.println("Name is"+a);
		

	}
	public static void main(String[] args) {
		Employee a= new Employee();
		a.employeeName("Arun");
		new Employee(100);
		
		
	}

}
