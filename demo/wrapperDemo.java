package demo;

class wrapper{
	
}

public class wrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;                        // primitive datatype
		
		Integer A = new Integer(5);     // boxing / wrapping
		
		Integer B = new Integer(a);     // boxing / wrapping
		
		Integer C = a;                   // auto boxing / auto wrapping
		
		
		
		
		int newElement = B.intValue();      // unboxing / unwrapping
		
		int newElement2 = C;                 // auto unboxing / auto unwrapping
		
		System.out.println(A);
		
		

	}

}
