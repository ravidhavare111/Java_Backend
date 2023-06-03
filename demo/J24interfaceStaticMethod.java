package demo;

interface Demo1{
	
	 int num = 7;
	
	
	static void show() {                             // static keyword 
		System.out.println("I am in Demo");
	}
	
}

class tempDemo implements Demo1{
	
}

public class J24interfaceStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1.show();             // we use  class.method()  for calling direclty method inside the class
	  //class.method();          // this calling is achieve whenever the inside method is static.
	}

}


