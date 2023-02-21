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
	
	for (Integer student : grade) {
		System.out.println("We want grades for all students " + grade);
		}
	//we can also do via Iterator
	Iterator<Integer>myint = grade.iterator();
	while (myint.hasNext()) {
	System.out.println("We are iterating grade here via Iterator "+ myint.hasNext());
	}

}
}