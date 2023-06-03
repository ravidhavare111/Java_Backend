package demo;

class A_A{
	public void show() {
		System.out.println("in AA");
	}
}

//class BB{
//	public void show() {
//		System.out.println("i am Best");
//	}
//}

public class J19AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A_A obj = new A_A() {                            //Anonymous class creation 
			public void show() {
				System.out.println("I am Best");
			}
		};
		
		obj.show();
		

	}

}
