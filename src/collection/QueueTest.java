package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer( "둘리" );
		queue.offer( "마이콜" );
		queue.offer( "도우너" );
		queue.offer( "희동이" );
		
		
		System.out.println( queue.isEmpty() );
		System.out.println( queue.poll() );
		System.out.println( queue.poll() );
		System.out.println( queue.peek() );
		System.out.println( queue.poll() );
		System.out.println( queue.poll() );
		System.out.println( queue.isEmpty() );
		
		System.out.println( queue.poll() );
		//비어 있으면  null
		

	}

}
