package demo;

interface AABBCC{
	public void show();
	default void work() {
		System.out.println("I am Working");
	}
	
}

public class J22interfaceAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AABBCC obj = new AABBCC() {
			public void show() {
				System.out.println("I am in AABBCC");
			}
		};
		
		obj.show();
		obj.work();
		
		

	}

}
