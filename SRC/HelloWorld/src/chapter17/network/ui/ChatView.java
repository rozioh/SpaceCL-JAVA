package chapter17.network.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chapter17.network.MultiChatClient;

public class ChatView extends JFrame {

	public String mIp;
	public String mNickName;
	public JTextArea mJta;
	private MultiChatClient mChatClient;
	
	public ChatView(String ip, String nickName) {
		mIp = ip;
		mNickName = nickName;  
		
		setSize(200, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("채팅창");
		
		//레이아웃 셋팅
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		mJta = new JTextArea();
		mJta.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(mJta);
		
		Panel p1 = new Panel();
		p1.setPreferredSize(new Dimension(800, 40));
		p1.setLayout(new BorderLayout());
		
		JTextField jt = new JTextField();
		JButton btnSend = new JButton("전송");
		
		//패널에 추가
		p1.add(jt, BorderLayout.CENTER);
		p1.add(btnSend, BorderLayout.EAST);
		
		//컨테이너 센터에 추가
		c.add(scrollPane, BorderLayout.CENTER);
		c.add(p1, BorderLayout.SOUTH);
		
		//전송버튼 클릭 이벤트
		btnSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendKey(mJta, jt);
			}
		});
		
		//입력필드 키 이벤트
		jt.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					sendKey(mJta, jt);
				}
			}
		});
		
		// 생성시에 ChatView 객체를 보낸다.
		mChatClient = new MultiChatClient(this, mNickName); // 4. 객체 생성되고 나서 생성된 this를 보낸다.
		mChatClient.start();
		
		
	}//end Constructor
	
	// 화면에 출력
	public void addViewMsg(String msg) {
		mJta.append(msg + "\n");
	}
	
	public void sendKey(JTextArea jta, JTextField jt) {

		jta.append(  jta.getText() + jt.getText() + "\n" );
		
		// 서버로 메시지 전송
		mChatClient.sendMsg(jt.getText());
		
		jt.setText("");
		jt.requestFocus();
		
		
	}
	
	
}//end class
