package hong5;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_n = 10; // 정수형 변수 k17_n을 정의하고 10을 저장해줍니다. 
		while(k17_n > 0) { //k17_n이 0보다 크면, 
			System.out.println(k17_n--); // k17_n을 하나씩 뺸다
		}
	}// while 반복문을 사용하게 되면 해당 식이 false가 될때까지 계속해서 반복하여 수행합니다. 
	// 즉 k17_n이 0보다 작아지지 않는다면, 이 문은 무한대로 계속 반복하여 수행될것입니다. 
}
