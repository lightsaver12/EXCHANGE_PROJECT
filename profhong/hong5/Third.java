package hong5;

import java.util.Calendar;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_iWeekday = 5; // 정수형 변수 k17_Weekday를 정의하고 안에 5를 채웁니다. 
							  // k17_iWeekday가 의미하는 것은 출력하려는 첫번째달에서 1이 시작하는 위치가 5번째에 있다는 뜻입니다.  
		int[] k17_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 정수형 배열 k17_iEnd를 정의하고 안에 숫자들을 채웁니다. 

		for (int k17_iMon = 0; k17_iMon < 12; k17_iMon++) { 
			// for 문을 돌려 k17_iMon를 12만큼 반복합니다. 이 for문은 월을 구하기 위해서입니다. 
			// for 문은 0부터 시작하므로 1월이 0이기 때문에 12 미만까지 돌리는 것입니다. 
			if (k17_iMon == 0) { // 만약 k17_iMon가 0이면, 즉 1월이면 
				System.out.printf("\n%13d월\n", k17_iMon + 1); // \n을 통해 줄을 바꾸고 iMon+1, 즉 1월을 출력합니다. 
			} else { // 아니라면
				System.out.printf("\n\n%13d월\n", k17_iMon + 1); 
				// 1월이 아닌 다른 월이라면 줄을 두번 바꾸고 각 월들을 출력합니다. 
			}
			System.out.printf("============================\n"); // == 출력합니다. 
			System.out.printf("%2s%3s%3s%3s%3s%3s%3s\n", "일", "월", "화", "수", "목", "금", "토"); // 문자열 클래스이므로 s를 사용하고 요일을 출력해줍니다. 
			for (int k17_i = 1; k17_i <= k17_iEnd[k17_iMon]; k17_i++) { 
				// 1일부터 말일까지 for문을 돌립니다. 이 for문을 통해 날짜가 출력됩니다. 
				if (k17_i == 1) { // 만약 k17_i가 1일 경우 즉, 1일인 경우에 
					for (int k17_j = 0; k17_j < k17_iWeekday; k17_j++) { 
						// 공백의 개수를 구하기 위해 for문을 돌립니다. 
						System.out.printf("    "); // 그리고 for문을 돌려 1일이 시작하는 요일 전까지 공백으로 채웁니다. 
					}
				}
				System.out.printf("%3d ", k17_i); //3칸의 간격을 부여하고 일들을 출력합니다. 
				k17_iWeekday++; // 각 일들을 출력할때마다 k17_iWeekday도 하나씩 늘려갑니다. 
				if (((k17_iWeekday % 7) == 0)) { 
					// 이부분은 일수들을 출력하며 줄바꾸기 기능을 위해 실행하는 조건문입니다. 
					// 만약 iWeekday가 7로 나누었을때 나머지가 없으면 즉, 일수의 위치가 일요일이 되면 줄을 바꾸게 하는 기능입니다.  
					System.out.printf("\n"); // 줄 바꾸기를 합니다. 
					k17_iWeekday = 0; // 줄 바꿀때마다 k17_iWeekday를 0으로 초기화해야합니다. 
					// 초기화를 하지 않으면 숫자가 커지면, 제대로 줄바꾸기가 이루어지지 않기때문에 초기화를 합니다. 
				}
			}
		}
	}
}
