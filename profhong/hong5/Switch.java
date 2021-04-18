package hong5;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 입력할 준비
		int k17_n = sc.nextInt(); // 정수형변수 k17_n을 정의하고 입력값을 받을 준비를 합니다. 
		
		switch(k17_n) { // 여러가지조건을 한번에 표시가능, 스위치 조건문
			case 1: // 첫번째 케이스
				System.out.println("Onepiece"); // 1번일때는 다음의 문구를 출력합니다.  
				break; // 끝냅니다. 끝내지 않으면 모든 케이스들의 출력문들을 다 출력합니다. 
			case 2: // 두번째 케이스
				System.out.println("2nel"); //2번일때는 다음의 문구를 출력합니다. 
				break; // 끝냅니다. 
			case 3: // 세번째 케이스
				System.out.println("Tree"); // 3번일때는 다음의 문구를 출력합니다. 
				break; // 끝냅니다. 
		}
	}
}
