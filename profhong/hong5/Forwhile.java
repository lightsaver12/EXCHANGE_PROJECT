package hong5;

public class Forwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_n = 10; // 정수형 변수 k17_n을 정의하고 10을 저장해줍니다. 
		while(k17_n > 0) { //k17_n이 0보다 크면, 
			System.out.println(k17_n--); // k17_n을 하나씩 뺸다
		}
	// while 반복문을 사용하게 되면 해당 식이 false가 될때까지 계속해서 반복하여 수행합니다. 
	// 즉 k17_n이 0보다 작아지지 않는다면, 이 문은 무한대로 계속 반복하여 수행될것입니다. 

		//이 식을 for 문으로 변환하게 된다면 
		for (int k17_i = 10; k17_i > 0; k17_i--) { 
			// k17_i는 10에서 시작해서 0이 되기전까지 k17_i를 반복하여 하나씩 빼줍니다. 
			System.out.println(k17_i); // 하나씩 빼면서 값들을 출력합니다. 
		}
	}
	// 즉 이 for문도 while문 과 같이 시작점, 마무리점 그리고 하나씩 뺀다의 식이 같은 반복문이므로 
	// 변환할 수 있습니다. 
}
		