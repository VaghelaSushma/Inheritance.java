package list_interfacekrutika;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Interface {
		public static void main (String[]args) {
		
	List<Integer> grade = new ArrayList<Integer>();
	grade.add(80);
	grade.add(85);
	grade.add(70);
	grade.add(80);
	List<Integer> grade1 = new ArrayList<Integer>();
	grade.add(80);
	grade.add(85);
	grade.add(70);
	grade.add(80);
	
	for (Integer student : grade) {
		System.out.println("We want grades for all students " + grade);}
		
	System.out.println("************************************************");
	grade.addAll(grade);
	System.out.println(grade);// It allows duplicate value
	System.out.println(grade.contains(85)); //can chk conatins function //true//
	System.out.println(grade.equals(72)); //can compare same number is there or not //false//
	System.out.println(grade.equals(70));//false//
    
	
}
}