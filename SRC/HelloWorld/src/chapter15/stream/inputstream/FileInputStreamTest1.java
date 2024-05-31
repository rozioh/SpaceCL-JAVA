package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("C:\\DEV\\WORKS\\SpaceCL-JapanClass1\\README.md");
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				} // end try ~ catch
			} // end if
		} // end try ~ finally
		System.out.println("end");
	} // main
} // end class
