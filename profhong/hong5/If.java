package hong5;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 입력을 받기 위해서
		int k17_n = sc.nextInt(); // 정수형 변수 k17_n을 정의하고 받을 준비를 합니다. 
		int k17_a = 6; //정수형 변수 k17_a를 정의하고 6을 저장해줍니다. 
		if (k17_n > k17_a) { // 만약 k17_n변수가 k17_a변수보다 크다면
			System.out.println(k17_n + " is bigger than " + k17_a); // k17_n은 k17_a보다 크다
		} else {// 아니면 
			System.out.println(k17_n + " is smaller than " + k17_a); // k17_n은 k17_a보다 작다
		}
		// if 조건문의 결과는 둘중에 하나입니다. 
		// ~하거나, 아님 ~하지 않거나 둘로 나뉘게 됩니다. 쉽게 얘기해서 결과는 true or false입니다. 
	}
}
