package chapter16.swing;

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
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 * 채팅 화면에 설계. main() 노필요
 * 
 */
public class LoginS extends JFrame {

	public LoginS() {
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("두잇!");
		
		// 레이아웃 셋팅
		Container c = getContentPane();
		c.setLayout(new BorderLayout(30, 20));
		
		JTextArea jta = new JTextArea();
		jta.setEditable(false); // 글을 쓸 수 없게 설정
		
		Panel pl = new Panel();
		pl.setPreferredSize(new Dimension(800, 40));
		pl.setLayout(new BorderLayout());
		
		JTextField jt = new JTextField();
		JButton btnSend = new JButton("전송");
		
		// 컨테이너 센터에 추가
		c.add(jta, BorderLayout.CENTER);
		c.add(pl, BorderLayout.SOUTH);
		
		// 패널에 추가
		pl.add(jt, BorderLayout.CENTER);
		pl.add(btnSend, BorderLayout.EAST);
		
		// 버튼 이벤트
		ActionListener btnAct = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!jt.getText().equals("")) {
					sendKey(jta, jt);
				}
			}
		};
		
		btnSend.addActionListener(btnAct);
		
		// 입력 필드 키 엔터 이벤트
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
					// 메시지 전송
					if(!jt.getText().equals("")) {
						sendKey(jta, jt);
					}
				}
			}
		});
		
		
	} // end Constructor
	
	public void sendKey(JTextArea jta, JTextField jt) {
//		jta.setText(jta.getText() + jt.getText() + "\n");
		jta.append(jt.getText() + "\n");
		jt.setText("");
		jt.requestFocus();
		
	} // 

} // end class
