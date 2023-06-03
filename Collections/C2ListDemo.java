package Collections;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class C2ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List values = new ArrayList();      // List has indexing like Array
		
		values.add(3);                 //here 3 is Integer, not int.
		values.add(8);
		values.add(13);
		values.add(5);
		values.add("Ravi");           // we can store any time if data in 1 List.
		values.add(2,"Hello");        // because we create list of objects
		                                 

		for(Object o : values) {
		System.out.println(o);
		}
		
	}

}
