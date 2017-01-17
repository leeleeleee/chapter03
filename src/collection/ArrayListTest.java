package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add( "둘리" );
		list.add( "이메일" );
		list.add( "도우넛" );
		
		//순회
		int count = list.size();
		for( int i = 0; i < count; i++ ) {
			String s = list.get( i );
			System.out.println( s );
		}
		
		//삭제
		list.remove( 1 );
		
		//순회2
		Iterator<String> it = list.iterator();
		while( it.hasNext() ) {
			String s = it.next();
			System.out.println( s );
		}
		
		//순회3
		for( String s : list ) {
			System.out.println( s );
		}

	}

}
