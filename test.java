public class test{
	public static void main( String[] args ){
		int temp;
		int[] ar = { 3, 6, 2, 5, 1, 4 };
		
		for( int i=0; i< ar.length; i++ ){
			for( int j = 1; j < ar.length; j++ ){
				if( ar[ j - 1 ]  >  ar[ j ] ){
					temp = ar[ j - 1 ];
					ar[ j - 1 ] = ar[ j ];
					ar[ j ] = temp;
				}
			}
		}

		for( int i=0; i< ar.length; i++ ){
			System.out.println( ar[ i ] );
		}

	}
}