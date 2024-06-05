package chapter17.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

/**
 * @since 2024-06-05
 * 클라이언트
 */
public class Client {
	public static void main(String[] args) {
		String msg = "안녕하세요? 저는 클라이언트에요.";
		
		// 포트번호 2012 번으로 서버에 연결 시도
		try {
			Socket sock = new Socket("127.0.0.1", 2024);
			System.out.println( new Date() + " ==> " + "2024 포트로 서버 접속에 성공 하였습니다.");
			
			System.out.println( new Date() + " ==> " + "클라이언트가 서버로 메시지를 송신 합니다.");
			
			BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(sock.getOutputStream()));
			bw.write( msg );
			bw.flush(); // 즉시전송
			
			// 클라이언트가 서버의 메시지를 받는다.
			BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String serverMsg = br.readLine(); // 서버 메시지
			System.out.println("서버로부터 수신내용: " + serverMsg);
			
			br.close();
			bw.close();
			sock.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // end main
} // end class
