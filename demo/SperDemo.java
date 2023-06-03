package demo;

class A{
	public A() {
		System.out.println("in A");
	}
	
	public A(int i) {
		System.out.println("i in A");
	}
}

class B extends A{
	
	public B() {
		super(5);
		System.out.println("in B");
	}

	public B(int i) {
		super(i);
		System.out.println("i in B");
	}
}

public class SperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj1 = new A();
		B obj2 = new B();
		
		
		

	}

}
