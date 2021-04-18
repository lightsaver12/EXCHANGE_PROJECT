package hong5;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] k17_score; // 배열을 선언합니다. 
		k17_score = new int []{70, 40, 60, 20, 80}; 
		// 크기가 5인 배열을 선언하고 배열안에 값들을 지정해줍니다. 
		System.out.println(k17_score[0]);
		System.out.println(k17_score[5]);
		// 다섯번째에는 저장되있는 것이 없기때문에 index out of bounds라는 에러가 출력이 됩니다. 
		//배열에서 0번째 순서에 저장된 값들을 출력해줍니다. 
		// score[0] = 70
		// score[1] = 40
		// score[2] = 60 ==> 이런 순서로 현재 배열에 저장되있습니다. 
		// score[3] = 20
		// score[4] = 80
	}
}
