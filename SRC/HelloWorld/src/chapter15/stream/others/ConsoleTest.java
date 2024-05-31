package chapter15.stream.others;
/**
 * cmd에서 실행
 * bin 폴더로 이동 후 java chapter15.stream.others.ConsoleTest
 */
import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console(); // 콘솔 클래스 반환
		
		System.out.println("이름: ");
		String name = console.readLine();
		System.out.println("직업: ");
		String job = console.readLine();
		System.out.println("비밀번호: ");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}
