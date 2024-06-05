package chapter17.network.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginView extends JFrame {

	private boolean isLoginSuccess = false;
	private ChatView mChatView;
	
	// 생성자
	public LoginView() {
		//기본셋팅
		setSize(200, 130);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("보더 레이아웃");
		
		//레이아웃 셋팅
		Container c = getContentPane();
		c.setLayout( new BorderLayout(30, 20) );
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2, 2));
		
		JButton btn5 = new JButton("로그인");
		
		c.add( p1, BorderLayout.CENTER );
		c.add( btn5, BorderLayout.SOUTH );
		
		Label lb1 = new Label("IP: ");
		lb1.setAlignment(Label.CENTER);
		Label lb2 = new Label("NickName: ");
		lb2.setAlignment(Label.CENTER);
		
		JTextField tfIp = new JTextField();
		JTextField tfNickName = new JTextField();
		
		tfIp.setText("192.168.0.49"); // IP 기본 셋팅

		p1.add(lb1);
		p1.add(tfIp);
		
		p1.add(lb2);
		p1.add(tfNickName);
		
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				isLoginCheck(tfIp, tfNickName);
				
			}
		});
		
		//키보드 엔터시
		tfNickName.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				if( e.getKeyChar() == KeyEvent.VK_ENTER ) {
					System.out.println("엔터");
					isLoginCheck(tfIp, tfNickName);
				}
				
			}
		});
		
	}
	
	/**
	 * 로그인 성공여부를 체크한다.
	 * @param tfIp
	 * @param tfNickName
	 * @return true:로그인 성공, false:로그인 실패
	 */
	public boolean isLoginCheck(JTextField tfIp, JTextField tfNickName) {
		if( "".equals(tfIp.getText())  ) {
			JOptionPane.showMessageDialog(null, "IP를 입력하세요");
			tfIp.requestFocus();
			return false;
		}
		else if( "".equals(new String(tfNickName.getText()))  ) {
			JOptionPane.showMessageDialog(null, "닉네임를 입력하세요");
			tfNickName.requestFocus();
			return false;
		}
		
		this.setVisible(false); // 로그인 화면은 가리고
		
		mChatView = new ChatView(tfIp.getText(), tfNickName.getText());
		mChatView.setVisible(true);
		
		return true;
	}//end method

	public boolean isLoginSuccess() {
		return isLoginSuccess;
	}

}
