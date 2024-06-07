package chapter17.network.ui;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class MultiChatClientUI {

	private ChatView mChatView; 
	private Socket mSocket;
	
	public MultiChatClientUI(ChatView chatView) {
		mChatView = chatView;
		
		try {
			mSocket = new Socket(mChatView.mIp, 9999); // 1. 소켓연결(ip, portNum)
			String msg = "서버에 접속되었다. " + mSocket.isConnected(); // 2. 접속확인 메시지 설정
			mChatView.mJta.append(msg + "\n"); // 3. msg를 채팅창에 붙인다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // 생성자
	
	// 서버로 메시지 전송
	public void sendMsg(String msg) {
		try {
			OutputStream os = mSocket.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
			byte[] bytes = msg.getBytes();
			bos.write(bytes);
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // end method
	
}
