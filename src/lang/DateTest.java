package lang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		printDate( now );
		printData2( now );
		
		System.out.println( now );
		System.out.println("==========================");
		Date d1 = new Date( 2000, 0, 16 ); //deprecated
		printDate( d1 );
		
		Date d2 = new Date( 100, 0 ,16, 13, 25, 30 );
		printDate( d2 );
		
		//1970년 1월 1일 00:00:00.000이후에
		//milliseconds 값을 세팅
		long milliseconds = 24 * 60 * 60 * 1000 * 365 * 30;
		Date d3 = new Date( milliseconds );
		

	}

	public static void printDate( Date d ) {
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		
		System.out.println( sdf.format( d ) );
		
	}
	
	public static void printData2( Date d ) {
		//년도 + 1900
		int year = d.getYear(); //deprecated
		
		//month(0~11)
		int month = d.getMonth();
		
		//day
		int date = d.getDate();
		
		//hours
		int hour = d.getHours();
		
		//monutes
		int minute = d.getMinutes();
		
		//sec
		int sec = d.getSeconds();
		
		System.out.println( (year + 1900) + "년 " + (month+1) + "월 " + date + "일" + hour + "시" + minute + "분" + sec + "초");
		
	}
	
}
