package chapter17.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultiChatServer {
	
	private HashMap<String , DataOutputStream> clients;
	private ServerSocket serverSocket;
	
	// 생성자
	public MultiChatServer() {
		clients = new HashMap<String, DataOutputStream>();
		
		// 여기 쓰레드에서 접근할 것이므로 동기화 시킨다.
		Collections.synchronizedMap(clients);
	}
	
	public void start() {
		
		try {
			Socket socket;
			
			// 서버 소켓 생성
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작 되었습니다.");
			
			// 무한 루프 돌면서 클라이언트와 연결되면 소켓을 생성하여 스레드로 돌린다.
			while(true) {
				socket = serverSocket.accept();
				// 쓰레드 시작
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // end start()


	public static void main(String[] args) {
		new MultiChatServer().start(); // 서버 시작
	} // end main
	
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream input;
		DataOutputStream output;
		
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				input = new DataInputStream(socket.getInputStream());
				output = new DataOutputStream(socket.getOutputStream());
			} catch (Exception e) {
				e.printStackTrace();
			} // end try
		}
		
		@Override
		public void run() {
			
			String name = "";
			
			try {
				name = input.readUTF();
				
				// 접속 클라이언트를 Map에 추가한다.
				clients.put(name, output);
				
				String msg = name + "님이 접속 하셨습니다.";
				sendToAll(msg);
				System.out.println(msg);
				
				System.out.println("현재 " + clients.size() + " 명이 대화방에 접속 중입니다.");
				
				// 메세지 전송
				while(input != null) {
					sendToAll(input.readUTF());
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 접속이 종료되면
				clients.remove(name);
				String msg = name + "님이 나가셨습니다.";
				sendToAll(msg);
				System.out.println(msg);
			}
		} // end run()
		
		// 채팅방 서버에 메시지를 쏘면 모든 클라이언트에게 메시지 발송.
		public void sendToAll(String msg) {
			Iterator<String> it = clients.keySet().iterator();
			while(it.hasNext()) {
				try {
					DataOutputStream dos = clients.get(it.next());
					dos.writeUTF(msg);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}; // end class
	
	
}; // end class


