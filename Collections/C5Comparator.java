package Collections;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;	


public class C5Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = new ArrayList<>();      // List has indexing like Array
		
		values.add(308);                 //here 3 is Integer, not int.
		values.add(842);
		values.add(136);
		values.add(540);    
			
		Comparator<Integer> c = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i%10 > j%10)
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(values, c);    

		for(Integer o : values) {
		System.out.println(o);
		}
		
	}

}
