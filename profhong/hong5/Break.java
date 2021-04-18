package hong5;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k17_i = 0; // 정수형 변수 k17_i를 정의하고 0으로 초기화합니다. 
		int k17_sum = 0; // 정수형 변수 k17_sum을 정의하고 0으로 초기화합니다. 

		while (true) { // 무한반복문 while(true)문
			if (k17_sum > 10) // 만약 k17_sum 변수가 10보다 커질경우에
				break; // 무한루프를 탈출합니다. 
			k17_i++; // 변수 k17_i는 계속해서 1씩 커집니다. 
			k17_sum += k17_i; // k17_sum변수에 k17_i의 합들을 계속해서 저장해줍니다. 

		} // while문의 끝
		System.out.println(k17_i); //k17_i를 출력해주세요.
		System.out.println(k17_sum); // k17_sum변수를 출력해주세요. 
	}	// k17_i를 무한대로 더해주고 그 값들을 k17_sum에다가 저장해줍니다. 
		// 그러다 조건문인 k17_sum의 합이 10보다 커질 경우에 무한루프를 탈출하기 떄문에
		// k17_sum이 15일 경우에 탈출되고 그때의 k17_i값은 5일때입니다. 
}	
