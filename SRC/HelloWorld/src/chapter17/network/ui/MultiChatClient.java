package chapter17.network.ui;

import java.net.Socket;

public class MultiChatClient {

	private ChatView mChatView; 
	private Socket mSocket;
	
	public MultiChatClient(ChatView chatView) {
		mChatView = chatView;
		
		try {
			mSocket = new Socket(mChatView.mIp, 9999); // 1. 소켓연결(ip, portNum)
			String msg = "서버에 접속되었다. " + mSocket.isConnected(); // 2. 접속확인 메시지 설정
			mChatView.mJta.append(msg + "\n"); // 3. msg를 채팅창에 붙인다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
