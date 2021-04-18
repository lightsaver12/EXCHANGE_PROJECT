package hong5;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k17_i = 0; k17_i < 10; k17_i++) { 
			//for 문을 돌려 k17_i 가 0부터 10까지 반복하여 돌도록 만들었습니다. 
			if (k17_i % 3 == 0) {
				// 여기에 조건문을 하나 만들었습니다. 
				// 0부터 10동안 도는 for문 안에서 만약 k17_i가 3으로 나눴을때 나머지가 0이라면,
				// 즉 3의 배수라면 
				continue; // 밑에 출력문을 무시하고 continue해라 
			}
			System.out.println(k17_i); // 그리고 마지막으로 k17_i를 출력하면
		}
	} // 3의 배수를 제외하고 0 부터 10까지의 숫자들이 출력되는 것을 볼 수 있습니다. 
}