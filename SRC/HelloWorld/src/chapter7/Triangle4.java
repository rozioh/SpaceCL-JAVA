package chapter7;

public class Triangle4 {
	public static void main(String[] args) {
		int row = 11;
		int col = row + (row - 1);
		final int FIRST_COL_IDX = col / 2; // 제일 처음 *(별)이 직힐 컬럼 인덱스
		final int CENTER_ROW_IDX = row / 2;
		
		String stars[][] = new String[row][col]; // 문자열 저장 2차원 배열
		
		/** 배열 초기화 → 모든 배열에 공백을 입력해준다. */
		for(int i = 0; i < stars.length; i++) {
			for(int j = 0; j < stars[i].length; j++) {
				stars[i][j] = " "; // 공백, 빈문자열, 스페이스
				// 열의 마지막 부분에는 개행 문자를 넣는다.
				if(j == stars[i].length - 1) {
					stars[i][j] += "\n";
				}
			}
		} // end for
		
		/** 배열에 별 입력하는 부분 */
		// 행의 갯수만큼 도는 for
		for(int i = 0; i < stars.length; i++) {
			// 변수 초기화
			int colIdx = 0;
			// 열이 몇번 돌아야하는지에 대한 값을 가지고 있는 변수
			int jCountNum = 0;
			boolean isStartNewCol = true;
			
			// 가운데 행까지만 별의 갯수가 증가한다.
			if(i <= CENTER_ROW_IDX) {
				// 별을 찍기 시작하는 열의 인덱스 번호를 추출한다.
				colIdx = FIRST_COL_IDX - i;
				jCountNum = i;
			}
			// 가운데 행 아래에서 부터는 별의 갯수가 감소한다. 
			else {
				//TODO
				colIdx = FIRST_COL_IDX - (FIRST_COL_IDX - i);
				jCountNum = stars.length - (i + 1);
			} // end if
			

			// 열의 갯수만큼 도는 for
			for(int j = 0; j <= jCountNum; j++) {
				if(!isStartNewCol) {
					colIdx += 2;
				}
				stars[i][colIdx] = "*";
				isStartNewCol = false;
			}
		} // end for
		
		/** 배열 값 출력 */
		for(int i = 0; i < stars.length; i++) {
			for(int j = 0; j < stars[i].length; j++) {
				System.out.print(stars[i][j]);
			}
		} // end for
	} // end main
} // end class
