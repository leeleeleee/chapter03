package lang;

public class StringTest2 {
	public static void main( String[] args) {
		String str1 = "abc";
		String str2 = "cde";
		String str3 = str2;
		
		str2 = str1.toUpperCase();
		System.out.println( str1 );
		System.out.println( str2 );
		System.out.println( str3 );
		
		str2 = str2.toLowerCase();
		System.out.println( str2 );
		
		String str4 = str2.concat( str3 );
		System.out.println( str4 );
		
		String str5 = "!".concat( str2 ).concat( "?" ).concat( "qwer");
		System.out.println( str5 );
		
	    String s1 = "hello";
	    String s2 = "hello";
	 
	    String s3 =  new String("hello");
	    String s4 =  new String("hello");

	    System.out.println( s1 == s2 );
	    System.out.println( s3 == s4 );
	    System.out.println( s2 == s4 );

	}
}
