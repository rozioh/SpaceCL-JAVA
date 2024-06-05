package chapter17.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * @since 2024-06-05
 * 네트워크 수업
 * TCP 통신
 */
public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(2024); // 포트번호
			System.out.println( new Date() + " ==> " + "서버: 클라이언트의 접속을 기다립니다.");
			
			// 클라이언트가 접속을 하면 Socket 객체로써 반환된다.
			Socket soc = ss.accept();
			
			// 접속한 클라이언트의 정보 출력
			String msg = "서버: " + soc.getInetAddress() + " 클라이언트와 ";
			msg += soc.getLocalPort() + " 포트로 연결 되었습니다.";
			System.out.println( new Date() + " ==> " + msg );
			
			// 클라이언트의 메세지를 받기위해 스트림을 가져온다.
			BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream())); 
			// 클라이언트로부터 한줄을 읽어온다.
			String clientMsg = br.readLine();
			System.out.println( new Date() + " ==> " +"서버(수신): " + clientMsg);
			
			Thread.sleep(2000);
			
			// 서버가 클라이언트로 메시지를 보낸다.
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( soc.getOutputStream())); 
			bw.write("안녕 클라이언트야 접속을 환영해!");
			
			// 사용했던 스트림 및 소켓을 닫아준다. 안닫아주면 메모리 잡아먹고 좀비 프로그램이 된다.
			bw.close();
			br.close();
			soc.close();
			ss.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		
	} // end main
} // end class
