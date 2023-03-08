package Abstraction_Example;

public abstract class Prashant_learning_Ins { 
	
	//this is a abstract class , we have used keyword abstract to make class abstract
	
	//and the rule is you must have at least one abstract method
	
	public abstract void trial_sessions() ;
	
	//this is abstract method, here implementation logic is not defined 


	public  void manual_sessions() {
		
		System.out.println("Its better to start with manual sessions in first 6 weeks"); //changed by Sushma
	}

	public void api_sessions() {
		
		
		System.out.println("Its really nice to have knowledge of API Testing and should be delivered in last 5 sessions");
	}

}



