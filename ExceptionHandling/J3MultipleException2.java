package ExceptionHandling;

public class J3MultipleException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
//			int brr[] = null;
//			brr[6] = 9;
			int arr[] = new int[5];
			arr[8] = 45;
			int i = 9;
			int j = 0;
			System.out.println("sum in -> "+ i/j);
		}
		 
		catch(ArithmeticException e) {
			System.out.println("Can't devide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Don't go outside of Array Limits....");
		}
		catch(Exception e) {
			System.out.println("Something went wrong....");
		}
		
		finally {
			System.out.println("Good Try");
		}

	}

}
