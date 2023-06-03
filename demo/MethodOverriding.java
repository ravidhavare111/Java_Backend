package demo;

class AA{                                    //Main or SUPER class
	 int i;
	public void show() {                     //method overriding
		System.out.println("in AA"); 
	}
}

class BB extends AA{                         // sub class extends by super class
	
//	@Override
	public void show() { 
		
//		super.show();
		System.out.println("in BB");
	}
	
	public void config() {
		System.out.println("Bb Config...");
	}
	
}

class CC extends AA{                         // sub class extends by super class
	public void show() {
		System.out.println("in CC");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA obj = new BB();          // runtime polymorphism
		obj.show();
		
		obj = new CC();             // Dynamic method Dispatch
		obj.show();
	

	}

}
