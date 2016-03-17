public class test2{
	public static void main( String[] args ){
		String sentence= "MADAM";
		String reverse= "";
		for( int i = sentence.length() - 1; i >= 0; i-- ){
			reverse = reverse + sentence.charAt(i);
		}

		if(sentence.equals(reverse)){
			System.out.println("This is a palindrome");
		} else {
			System.out.println("This is not a palindrome");
		}
	}
}