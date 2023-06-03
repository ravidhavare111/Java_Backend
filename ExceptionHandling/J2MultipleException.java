package ExceptionHandling;

public class J2MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int arr[] = new int[5];
			arr[8] = 45;
			int i = 9;
			int j = 0;
			System.out.println("sum in -> "+ i/j);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		}
		
		finally {
			System.out.println("Good Try");
		}

	}

}
