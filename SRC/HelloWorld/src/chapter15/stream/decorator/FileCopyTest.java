package chapter15.stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long millisecond = 0;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try{
			FileInputStream fis = new FileInputStream("C:/Program Files (x86)/Microsoft/Edge/Application/125.0.2535.67/msedge.dll");		
			bis = new BufferedInputStream(fis);

			FileOutputStream fos = new FileOutputStream("msedge.dll");
			bos = new BufferedOutputStream(fos);

			// 파일을 복사하기 전 시간
			millisecond = System.currentTimeMillis(); 
			
			int i;
			while( (i = fis.read()) != -1 ) {
				fos.write(i);
			}
			
			// 파일을 복사하는데 거리는 시간 계산
			millisecond = System.currentTimeMillis() - millisecond;
						
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} // end finally
		System.out.println("파일 복사하는데 " + millisecond + " milliseconds 소요되었습니다.");
	} // end main
} // end class
