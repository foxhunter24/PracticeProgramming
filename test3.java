public class test3{
	public static boolean checkPrime( int n ){
		for( int i = 2; i < n; i++ ){
			if(  n % i == 0 ){
				return false;
			}
		}
		return true;
	}
	public static void main( String[] args ){
		//System.out.println( 0 );
		//System.out.println( 1 );

		for( int i = 2; i <= 100; i++ ){
			if( checkPrime( i ) ){
				System.out.println( i );
			}
		}
	} 
}