package MultiThreading;

public class M4JoinAndisAlive {
	public static void main(String[] args) throws Exception {
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
		
		System.out.println(t1.isAlive());   //shows the Thread tasks are completed or not
		
		t1.join();    //here main Thread wait till t1 threads task completed.
		t2.join();    //here main Thread wait till t2 threads task completed.
		              // after completed t1 and t2 thread tasks, now main Thread will start executing there own tasks.
		System.out.println(t1.isAlive());  
		System.out.println("Well Done... Bye...");
	}
}
