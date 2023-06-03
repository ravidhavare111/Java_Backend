package Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class C1CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection values = new ArrayList();      // Collection do not have indexing like Array
		
		values.add(3);
		values.add(8);
		values.add(13);
		values.add(5);
//		System.out.println(values);
		
		Iterator it = values.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
//		Iterator itt = values.iterator();
//		int i= 0;
//		while(i<values.size()) {
//		System.out.println(itt.next());
//		i++;
//		}
		
	}

}
