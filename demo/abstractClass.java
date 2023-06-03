package demo;

abstract class human{                        // abstract class because it has abstract method
	
	public abstract void eat();              // abstract method
	
	
	public void walk() {
		System.out.println("Human can walk..");
		
	}
}


class man extends human{ 
	public void eat() {
		System.out.println("Man eat food.");
	}
}

public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		human obj = new man();
		
		obj.eat();
		obj.walk();

	}

}
