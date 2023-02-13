package employeeData;

public class Emp2 extends Employee{
	int id =456;
	String name="Rajesh";
	String designation = "Team leader";
	
	public void show() {
		System.out.println("Name=Rajesh,Id=456,Designation=Team Leader");
	}
	 
//Sub class has it's own method which override the statement from parent class
	public void overtime() {
		System.out.println("Rajesh can not work more than 40 hours.");
	}


}