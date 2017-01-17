package lang;

public class StringTest {
	public static void main(String[] arg) {
		
		//escape 문자
		String s = "i say \"hello\"";
		System.out.println( s );
		
		//문자형에서 '-> 출력
		char c = '\'';
		
		// c:\dowork -> 출력
		String s1 = "c:\\doworlk";
		System.out.println( s1 );
		
		// \t, \n, \r\n
		System.out.print("\n"); // Enter Key
		
		String a;
		String d;
		String b;
		a="hello"+2;
		b =" wolrd";
		d= a+b;
		System.out.println(d);
		
		//+ 연산이 가능하다.
		String s2 = "321";
	//	System.out.println(s2.charAt(3));
		int i=1;
		int num = Integer.parseInt(s2);
		//String str = String.valueOf(1);
		System.out.println( num );
	//	System.out.println( str );

	}
}
