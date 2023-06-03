package demo;

interface Demo{
	public void abc();
	default void show() {
		System.out.println("I am in Demo");
	}
	
}

interface myDemo	{
	default void show() {
		System.out.println("I am in myDemo");
	}
}

class DemoImp implements Demo, myDemo{
	public void abc() {
		System.out.println("I am in DemoImp");
	}

//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		Demo.super.show();
//	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		myDemo.super.show();
	}


	
	
	
}

public class J23interfaceMethodOveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj = new DemoImp();
		
//		obj.abc();
		obj.show();
		

	}

}
