public class test4{

	

	public static void main( String[] args ){
		int[] arr1 = { 3, 6, 2, 5, 1, 4 };
		int[] arr2 = selectionSort( arr1 ); 

		for( int i = 0; i < arr2.length; i++ ){
			System.out.println(arr1[ i ]);
		}
	}

	public static int[] selectionSort( int[] a ){

		for( int i = 0; i < a.length - 1; i++ ){
			//Index holding the first value till the second last value of array
			int index = i;
			//This for loop will run from the second value till the last value.
			for( int j = i + 1; j < a.length; j++ ){
				if( a[ j ] < a[ index ] ){
					index = j;
				}
			}
			int smallNumber = a[ index ];
			a[ index ] = a[ i ];
			a[ i ] = smallNumber;
		}
		return a;  	
	}
}