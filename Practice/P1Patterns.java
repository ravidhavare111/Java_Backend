package Practice;

public class P1Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int space= n-1;
		for(int i = 1; i<=n ; i++) {
			for(int j = 0 ; j< space ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k<i ; k++) {
				System.out.print("+");
			}
			System.out.println();
			space--;
		}

	}

}
