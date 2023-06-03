package Collections;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class C3ListOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = new ArrayList<>();      // List has indexing like Array
		
		values.add(3);                 //here 3 is Integer, not int.
		values.add(8);
		values.add(13);
		values.add(5);     
		                                 

		for(Integer o : values) {
		System.out.println(o);
		}
		
	}

}
