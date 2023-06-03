package demo;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		
		for(int x : arr) {                                  //for each loop
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println();
		
		int arr2D[][] = {{1,2,3,4,5,6,7},
				         {4,5,6,7},
				         {7,8,9,10,11}
				         };
		
//		for(int i = 0; i<arr2D.length; i++) {                 //nested for loop
//			for(int j = 0; j<arr2D[i].length ; j++) {
//				System.out.print(arr2D[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int a[] : arr2D) {                          //nested for each loop for 2D array
			for(int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}

	}

}
