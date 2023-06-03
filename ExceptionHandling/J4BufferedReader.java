package ExceptionHandling;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class J4BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		InputStreamReader in = new InputStreamReader(System.in);   //input reader
//		
//		BufferedReader br = new BufferedReader(in);     // stored input in bufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp = br.readLine();                    // stored br data in string variable for use
		
		System.out.println(temp);                       //  print string data
		
		System.out.println();    
		
		int temp2 = Integer.parseInt(temp);            //convert string data to integer value
		System.out.println(temp2);                     // print integer value
		

	}

}
