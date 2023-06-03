package MultiThreading;

public class M5NameAndPriority {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(() -> {        //create thread for object of method of class 
				for(int i = 0; i<5 ; i++) {
				System.out.println("Hi " + Thread.currentThread().getPriority());
					try {
					Thread.sleep(500);
					}
					catch(Exception e) {
					}
				}
			}, "Hi Thread");   // we directly set name of thread here also
		
		Thread t2 = new Thread(() -> {       //create thread for object of method of class
				for(int i = 0; i<5 ; i++) {
				System.out.println("Hello " + Thread.currentThread().getPriority());
					try {
						Thread.sleep(500);
					}
					catch(Exception e) {
					}
				}
			}, "Hello Thread");    // we directly set name of thread here also
		
//		t1.setName("Hi Thread");             // set Thread name
//		t2.setName("Hello Thread");          // set thread name
		
//		System.out.println(t1.getName());     // get thread name
//		System.out.println(t2.getName());     // get thread name
//		
		
		t1.setPriority(2);    // Min Priority  -> 1
//		t1.setPriority(Thread.MIN_PRIORITY);  // also we can use this for minimum priority.
		
		
		t2.setPriority(9);    // High Priority -> 10
//		t2.setPriority(Thread.MAX_PRIORITY);  // also we can use this for high priority.
		
		System.out.println(t1.getPriority());  // can get priority of thread using this syntax
		System.out.println(t2.getPriority());  // can get priority of thread using this syntax
		
		t1.start();
		try {
		Thread.sleep(10);
		}
		catch(Exception e) {
		}
		t2.start();
		
		System.out.println(t1.isAlive());   //shows the Thread tasks are completed or not
		
		t1.join();    
		t2.join();    
		
		System.out.println(t1.isAlive());  
		System.out.println("Well Done... Bye...");
	}
}
