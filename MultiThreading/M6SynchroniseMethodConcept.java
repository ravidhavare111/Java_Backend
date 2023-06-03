package MultiThreading;

class counter{
	int count;
	
	public synchronized void counting() {
		count++;
	}
}

public class M6SynchroniseMethodConcept {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		counter C = new counter();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 1; i<=1000; i++) {
					C.counting();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i< 1000 ; i++) {
					C.counting();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(C.count);

	}

}
