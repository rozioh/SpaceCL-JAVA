package chapter15.stream.decorator;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		
		try {
			FileInputStream fis = new FileInputStream("C:\\DEV\\WORKS\\SpaceCL-JapanClass1\\README.md");
			isr = new InputStreamReader(fis);
			
			int i;
			while( (i = isr.read()) != -1 ) {
				System.out.print((char)i); // 바이트로 읽어오는 스트림 임에도 불구하고 보조스트림에 의해서 제대로 읽어온다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	} // end main
} // end class
