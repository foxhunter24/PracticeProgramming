public class test5{
	public static void main( String[] args ){
		int num = 10;
		int div = 0;
		int result = 0;
		try{
			result = num / div;
			System.out.println("Into the try block ");
		} catch ( Exception e ){
			System.out.println("Catch");
		} finally{
			System.out.println("finally");
		}
	}
}