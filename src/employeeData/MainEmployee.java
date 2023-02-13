package employeeData;

public class MainEmployee {

	public static void main(String[] args) {
		Emp1 e1 = new Emp1();
		Emp2 e2 = new Emp2();
		
		e1.display();
		e1.skill();
		e1.overtime();
		
		e2.overtime();//It won't print statement from parent class as this same method has it's own override statement
		e2.show();
		e2.skill();

	}

}
