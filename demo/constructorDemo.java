package demo;

class constructDemo{
	
	int val1;
	int val2;
	int result;
	String demo;
	
	
	constructDemo(){
		val1 = 2;
		val2 = 5;
	}
	
	constructDemo(int a){
//		System.out.println(a);
		val1 = a;
		
	}
	
	constructDemo(int b, double c){
		val1 = b;
		val2 = (int)c;
//		System.out.println(val1 + " " + val2);
	}
	
	public void task() {
		val1 = 100;
		val2 = 200;
		demo = "nothing";
		
		System.out.println(val1 + " "+ val2+" "+demo);
	}
	public void task(int a) {
		val1 = a;
		val2 = 200;
		demo = "nothing";
		
		System.out.println(val1 + " "+ val2+" "+demo);
	}
	public void task(int a, int b) {
		val1 = a;
		val2 = b;
		demo = "nothing";
		
		System.out.println(val1 + " "+ val2+" "+demo);
	}
	public void task(int a, int b, String c) {
		val1 = a;
		val2 = b;
		demo = c;
		
		System.out.println(val1 + " "+ val2+" "+demo);
	}
	
}

public class constructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructDemo obj0 = new constructDemo();		
		constructDemo obj1 = new constructDemo(24);
		constructDemo obj2 = new constructDemo(66, 80.4);
		
		
//		System.out.println(obj2.val1);
		
		obj0.task();
		obj0.task(2);
		obj0.task(3,6);
		obj0.task(45,65,"Hello");
		

	}

}
