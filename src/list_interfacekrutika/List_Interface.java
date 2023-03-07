package list_interfacekrutika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_Interface {
		public static void main (String[]args) {
		
	List<Integer> grade = new ArrayList<Integer>();
	grade.add(80);
	grade.add(85);
	grade.add(70);
	grade.add(80);
	List<Integer> grade1 = new ArrayList<Integer>(Arrays.asList(80,85,70,80));
	
	
	List<Integer> grade2 = new ArrayList<Integer>();
	grade2.add(80);
	grade2.add(85);
	grade2.add(70);
	grade2.add(89);
	Collections.sort(grade);
		
	for (Integer student : grade) {
		System.out.println("We want grades for all students " + grade);
	System.out.println("We have sorted this list " + grade);	
	}
		
	System.out.println("************************************************");
	//grade.addAll(grade);
	//System.out.println(grade);// It allows duplicate value
	//System.out.println(grade.contains(85)); //can chk conatins function //true//
	System.out.println(grade.equals(grade1)); //checking list grade with grade1 it's true
	System.out.println("We are comapring grade with grade2 " + grade.equals(grade2) );
	
	
	
	
    
	
}
}