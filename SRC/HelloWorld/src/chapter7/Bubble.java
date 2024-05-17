package chapter7;

public class Bubble {
	public static void main(String[] args) {
		int data[] = {2, 9, 10, 3, 7, 15, 5};
		
		System.out.println("원래 데이터");
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ", ");
		} // end for
		System.out.println();
		System.out.println("버블 소팅");
		
		int dLen = data.length;
		
		// length-1의 의미는 마지막 pivot 은 오른쪽으로 검사할 대상이 없으므로 
		// for 문을 돌지않게 하지 위한 조치이다.
		for(int i = 1; i < dLen - 1; i++) { 
			
			// pivot 값으로 오른쪽으로 계속 비교해주는 for 문이다.
			for(int j = 0; j < (dLen - i); j++) {
				// 왼쪽에 값이 오른쪽 값보다 크냐?
				if(data[j] > data[j+1]) {
					// 왼쪽값이 작아야된다. 작은순대로 정렬할 것이기 때문에
					// swap 알고리즘 - 현재 왼쪽 값을 임시 변수 k에 저장해둔다.
					int k = data[j]; 
					data[j] = data[j+1]; // 왼쪽 자리에 오른쪽 값을 저장한다.
					data[j+1] = k; // 오른쪽 자리에 왼쪽 값을 저장한다.
				}
			}
		} // end for
		
		System.out.println("소팅 후 출력");
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ", ");
		} // end for
		
	} // end main
} // end class
