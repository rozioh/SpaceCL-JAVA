package chapter16.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


/**
 * @since 2024-06-04
 * @author ahn
 * 
 * BorderLayout
 */
public class BorderLayoutTest extends JFrame{

	private boolean isLoginSuccess = false;
	private LoginS mChatView;
			
	
	public BorderLayoutTest() {
		// 기본세팅
		setSize(200, 130); // 화면 크기
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 엑스
		setTitle("BorderLayout"); // 제목

		// 레이아웃 셋팅
		Container c = getContentPane();
		c.setLayout(new BorderLayout(30, 20)); //int hgap, int vgap

		Panel pl = new Panel();
		pl.setLayout(new GridLayout(2, 2));

		JButton btn5 = new JButton("확인");

		c.add(pl, BorderLayout.CENTER);
		c.add(btn5, BorderLayout.SOUTH);

		Label lb1 = new Label("ID: ");
		lb1.setAlignment(Label.CENTER);
		Label lb2 = new Label("PW: ");
		lb2.setAlignment(Label.CENTER);
		TextField tfId = new TextField();
		JPasswordField tfPw = new JPasswordField();

		pl.add(lb1, 0);
		pl.add(tfId);

		pl.add(lb2);
		pl.add(tfPw);

		ActionListener btnAct = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck(tfId, tfPw);
			}
		};

		tfPw.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				//				System.out.println("keyPressed: " + e.getKeyChar());
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					isLoginCheck(tfId, tfPw);
				}

			}
		});
		btn5.addActionListener(btnAct);

		setVisible(true);
	}

	/**
	 * 로그인 성공여부를 체크한다.
	 * @param tfId
	 * @param tfPw
	 * @return true: 로그인 성공, false: 로그인 실패
	 */
	public boolean isLoginCheck(TextField tfId, JPasswordField tfPw) {
		if(tfId.getText() == null || "".equals(tfId.getText())) {
			JOptionPane.showMessageDialog(null, "ID를 입력하세요");
			tfId.requestFocus();
			return false;
		}else if("".equals(new String(tfPw.getPassword()))) {
			JOptionPane.showMessageDialog(null, "PW를 입력하세요");
			tfPw.requestFocus();
			return false;
		}else if("abcd".equals(tfId.getText()) && "0987!".equals(tfPw.getText())) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			isLoginSuccess = true;
			// 채팅창은 띄우고
			mChatView = new LoginS();
			mChatView.setVisible(true);
			
			// 로그인 창은 사라지고
			this.setVisible(false);
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
			tfPw.requestFocus();
			return false;
		}
	}

	// get
	public boolean isLoginSuccess() {
		return isLoginSuccess;
	}
	
	

}
