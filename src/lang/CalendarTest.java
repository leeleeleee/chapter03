package lang;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printData( cal );
		
		//특정 날짜 선택하기
		cal.set( Calendar.YEAR, 2007 );
		cal.set( Calendar.MONTH, 10 ); // 11월
		cal.set( Calendar.DATE, 12 );
		
		cal.set(2007, 10, 12);
		cal.add( Calendar.DATE, 100 );
		
		printData( cal );
		}

	public static void printData ( Calendar cal ) {
		String[] days = { "", "일", "월", "화", "수", "목", "금", "토" };
		int year = cal.get( Calendar.YEAR );
		int month = cal.getMaximum( Calendar.MONTH );
		int date = cal.get( Calendar.DATE );
		int day = cal.get(Calendar.DAY_OF_WEEK );
		int hour = cal.get( Calendar.HOUR );
		int min = cal.get( Calendar.MINUTE );
		int sec = cal.get( Calendar.SECOND );
		
		System.out.println( year + "-" + (month+1) + "-" + date + "-"  + hour + ":" + min + ":" + sec);
	}
}
