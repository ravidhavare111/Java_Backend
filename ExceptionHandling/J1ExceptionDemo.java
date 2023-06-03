package ExceptionHandling;

public class J1ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int i = 7;
		int j = 3;
		
		int sum = i/j;
		System.out.println("sum is -> "+ sum);
		}
		
		catch(Exception e){
			System.out.println("error");
		}
		
		finally{
			System.out.println("Good try");
		}
		
		

	}
}
	
