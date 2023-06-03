package demo;

final class AB{
	
	final int NUM = 5;       //only 1 time we can assign value to num, beacsue FINAL keyword.
	public void show() {
		System.out.println("in AB");
	}
	
}

class ABB{
	public final void print() {
		System.out.println("in ABB");
	}
}

class AABB extends ABB{
//	public void print() {       // can't override print method with FINAL print method in super class
//		System.out.println("in AABB");
//	}
}

//class ABB extends AB{     // if super class is FINAL class, we can't extends by any sub class.
//	
//}

public class finalKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		AB obj = new AB();
//		obj.show();
		AABB obj1 = new AABB();
		obj1.print();

	}

}
