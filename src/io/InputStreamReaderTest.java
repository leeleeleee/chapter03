package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		try{
			//ms949 -> utf-8(java)
			isr = new InputStreamReader( new FileInputStream("ms949.txt"), "ms949");
			
			int data = -1;
			while( ( data = isr.read()) != -1) {
				System.out.println( (char)data );
			}
			
		} catch( FileNotFoundException e ){
			System.out.println( "file open fail:" + e );
		} catch( IOException e ) {
			System.out.println( "file io fail: " + e);
		} finally {
			if( isr != null){
			isr.close();
			}
		}
	}

}
