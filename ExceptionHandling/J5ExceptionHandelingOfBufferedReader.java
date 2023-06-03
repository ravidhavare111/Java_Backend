package ExceptionHandling;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class J5ExceptionHandelingOfBufferedReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = null;
		int temp = 0;
		
		try {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		temp = Integer.parseInt(br.readLine());
//		System.out.println(temp);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			br.close();	
		}
		System.out.println(temp);
		

	}

}
