package demo;

class calculator{
	public int add(int a, int b) {
		return a+b;
	}
}

class AdvCal extends calculator{          // inherited by calculator class
	public int sub(int a, int b) {
		return a-b;
	}
}

class VeryAdvCal extends AdvCal{          // inherited by AdvCal class
	public int mul(int a, int b) {
		return a*b;
	}
}

public class inheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator C1 = new calculator();
		AdvCal     C2 = new AdvCal();
		VeryAdvCal C3 = new VeryAdvCal();
		
		System.out.println(C1.add(5,2));
		System.out.println(C2.sub(6,2));
		System.out.println(C3.mul(4, 3));
		
	}

}
