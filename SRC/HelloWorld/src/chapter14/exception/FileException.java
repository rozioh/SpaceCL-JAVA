package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("a.txt");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException 발생");
		}finally {
			// 무조건 실행되는 곳
			// try 실행되고 에러가 나도 실행되고, 에러가 안나도 실행된다.
			System.out.println("finally 실행");
		}
		
	}
}
