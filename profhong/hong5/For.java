package hong5;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 입력을 하기 위한 준비
		int k17_n = sc.nextInt(); // 정수형 변수 n을 정의하고 입력할 준비를 한다.

		for (int k17_i = 1; k17_i <= k17_n; k17_i++) {
			// 구구단 for 반복문중에서 첫번째 for 문은 첫번째 변수에 해당됩니다.
			// 첫번째 변수가 1부터 n 번째까지 반복하여 출력되고 하나씩 더해집니다.
			for (int k17_j = 1; k17_j <= k17_n; k17_j++) {
				// 두번째 for문은 두번쨰 변수에 해당합니다. 마찬가지로 1부터 n번째까지
				// 반복하여 출력됩니다. 
				System.out.println(k17_i + "X" + k17_j + "=" + k17_j * k17_i);
				// 마지막으로 이 식을 출력할때 곧 입력을 3으로 받게 되면, 
				// 두 숫자 모두 1부터 3까지 차례대로 출력되며 차례가 끝나면 
				// 다음 숫자로 넘어가 다시 반복을 실행합니다. 
			}
		}
	}
}
