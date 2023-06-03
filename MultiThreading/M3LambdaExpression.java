package MultiThreading;

public class M3LambdaExpression {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(() -> {        //create thread for object of method of class 
				for(int i = 0; i<5 ; i++) {
				System.out.println("Hi");
					try {
					Thread.sleep(500);
					}
					catch(Exception e) {
					}
				}
			});
		
		Thread t2 = new Thread(() -> {       //create thread for object of method of class
				for(int i = 0; i<5 ; i++) {
				System.out.println("Hello");
					try {
						Thread.sleep(500);
					}
					catch(Exception e) {
					}
				}
			});
		
		t1.start();
		try {
		Thread.sleep(10);
		}
		catch(Exception e) {
		}
		t2.start();
	}
}
