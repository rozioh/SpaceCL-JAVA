package chapter7;
/**
 * 클래스의 주석: 해당 클래스가 어떤 일을 하는 건지를 요약하는 주석
 * 2차원 배열을 만들기 위한 클래스
 * @author Ahn
 * @since 2024.5.14
 * @version 1.0
 */
public class Triangle2 {
	public static void main(String[] args) {
		// 2차원 배열
		//              행(row) 열(col)
		int cc[][] = new int[3][3];
		cc[0][2] = 100;
		cc[1][1] = 200;
		cc[2][0] = 300;
		
		for(int i = 0; i < cc.length; i++) { // 행
			for(int j = 0; j < cc[i].length; j++) { // 열
				System.out.print(cc[i][j] + " ");
			}
			System.out.println();
		}
	} // end main
} // end class
