import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		try{
		FileOutputStream fos = new FileOutputStream( "1234.txt" );
		
		BufferedOutputStream bos = new BufferedOutputStream( fos );
		for( int i = '0'; i < '9'; i++ ){
			fos.write( i );
		}
		} catch (FileNotFoundException e) {
			System.out.println("파일 열기 실패: " + e);
		} catch( IOException e ) {
			System.out.println("파일 열기 실패: " + e);
		}
	}

}
