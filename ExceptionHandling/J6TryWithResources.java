package ExceptionHandling;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class J6TryWithResources {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
//		BufferedReader br = null;
		int temp = 0;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {  //try with only BufferedReader without catch and finally
		
		temp = Integer.parseInt(br.readLine());
		}
		
		System.out.println(temp);
		
	}

}
