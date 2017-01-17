package lang;

public class StringTest3 {

	public static void main(String[] args) {
		String s = "aBcAbCabcABC";
		
		//charAt
		System.out.println( s.charAt( 2 ) );
		
		//indexOf
		System.out.println( s.indexOf( "abc" ) );
		System.out.println( s.indexOf( "xyz" ) );
		
		//length()
		System.out.println( s.length() );
				
		//replace 
		System.out.println( s.replace( 'a', 'r' ) );
		System.out.println( s );
		
		//replaceAll 
		System.out.println( s.replaceAll("abc", "123"));
		
		//substring
		System.out.println( s.substring(0, 3));
		
		//toLowerCase()
		System.out.println( s.toLowerCase() );
		
		String str1 = " abcd";
		String str2 = ",efg ";
		str1 = str1.concat(str2);
		
		//concat
		System.out.println(str1);
		
		//trin : 공백 제거, 단 앞뒤에 공백만 제거
		System.out.println();
		System.out.println( str1.trim() );
		
		//split 문자열 분리
		String[] result = str1.split( "," );
		for (String str : result) {
		System.out.println(str);
		}
		
		//split 예외
		String str5 = "abcdef";
		String[] result5 = str5.split(",");

	}

}
