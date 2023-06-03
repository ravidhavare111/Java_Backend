package Collections;
import java.util.*;

public class C7SetHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s = new HashSet<>();
		s.add(5);
		s.add(7);
		s.add(4);
		s.add(3);
		
		Set<Integer> ss = new TreeSet<>();
		ss.add(43);
		ss.add(32);
		ss.add(86);
		ss.add(67);
		
		for(Integer x : s) {
			System.out.print(x+" ");    
		}
		System.out.println();
		System.out.println();
		for(Integer x : ss) {
			System.out.print(x+" ");    
		}
		

	}

}
