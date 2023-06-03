package demo;

class Outer{    // Outer class                     name in file:- Outer.class
	
	int a;
	
	public void print() {
		System.out.println("Outer Class");
	}
	
	
	class Inner{   // Inner class                  name in file :-    Outer$Inner.class
		public void print() {
			System.out.println("Inner Class");
		}
	}
	
}


public class innerClass {              //           name in file :-    innerClass.class  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer obj = new Outer();
		
		Outer.Inner obj1 = obj.new Inner();
		
//		obj.print();
		obj1.print();		

	}

}
