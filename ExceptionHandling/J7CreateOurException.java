package ExceptionHandling;

public class J7CreateOurException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 9;
		int j = 10;
		int sum = 0;
		try {
			sum = i/j;
			if(sum == 0) {
				throw new raviException("It is not possible.....");
			}
			
			System.out.println(sum);
		}
		catch(raviException e){
			System.out.println("error. " + e.getMessage() );
		}

	}

}
