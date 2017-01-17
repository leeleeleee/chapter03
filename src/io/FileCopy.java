package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
		fis = new FileInputStream( "samsung.png" );
		fos = new FileOutputStream("samsung2.png");

		int data = 0;
		while( ( data = fis.read() ) != -1) {
			fos.write( data );
		}
		

		} catch(FileNotFoundException e) {
			System.out.println( "파일이 없습니다-" + e );
		} catch( IOException ex ) {
			System.out.println( "i/o exception-" + ex );
		} finally {
			//자원 정리
			try{
				
			if( fis != null ){
				fis.close();
			}
			if( fos != null ){
				fos.close();
			}
			} catch (IOException e){
				System.out.println( "i/o exception-" + e );
			} 
		}

	}

}
