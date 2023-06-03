package demo;

interface Abcc{
	void show();
}

//class Implementor implements Abc{
//	public void show() {
//		System.out.println("Anything");
//	}
//}

public class J20interfaceWithAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abcc obj = new Abcc() {                     //anonymous class creation for interface Abc
			public void show() {
				System.out.println("I am Best");
			}
		};
		
		obj.show();

	}

}















