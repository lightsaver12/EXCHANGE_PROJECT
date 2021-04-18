package hong5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k17_itemname = new String[] { "웨어하우스", "차카나요", "사브레", "밀딥키스", "짱셔요", "쿠키앤크림", "스윙스칩", "포카칩", "꼬북펀칩",
				"오나의감자", "홈런볼", "에너르기바", "꼬북이", "월드콘경기장", "아이개셔", "올때메로나", "정보석바", "씽씽바", "오감자칩", "쫀드기", "코코볼", "마이쮸우",
				"새우깡", "감자깡까", "맛동산이", "아폴로밍", "너고소미", "빼뺴말로", "쵸코얼음땡", "마이콘치즈" };
		// 문자열 배열 k17_itemname을 생성하고 안에 값들을 저장해줍니다. 
		int[] k17_price = new int[] { 1000, 800, 1200, 1300, 900, 1000, 1100, 1200, 1500, 1300, 2100, 1200, 1300, 1000, 900,
				900, 900, 900, 1300, 800, 3000, 1200, 1100, 1300, 2100, 800, 1300, 1200, 1200, 1300 };
		// 정수형 배열 k17_price를 생성하고 안에 값들을 저장해줍니다.  
		int[] k17_num = new int[] { 1, 1, 3, 2, 2, 1, 3, 2, 1, 2, 2, 1, 3, 2, 3, 2, 1, 3, 4, 2, 3, 1, 3, 2, 1, 1, 2, 2, 2,
				1 }; // 정수형 배열 k17_num을 생성하고 안에 값들을 저장해줍니다. 

		boolean[] k17_taxfree = new boolean[] { true, true, false, false, false, false, false, true, true, false, true,
				false, true, true, true, true, false, false, false, true, false, true, false, false, true, false, true,
				true, true, false };
		// 부울 자료형 배열 k17_taxfree를 생성하고 안에 값들을 저장해줍니다. 
		DecimalFormat k17_df = new DecimalFormat("###,###,###,###,###"); // 콤마를 구하기 위한 식입니다.
		Calendar k17_cal = Calendar.getInstance(); // 실제 날짜, 시간을 구하기 위한 식입니다. 
		SimpleDateFormat k17_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // 실제 날짜, 시간을 원하는 방식으로 지정하는 식입니다. 
		System.out.printf("%11s%27s\n%33s\n%32s\n", "emart", "이마트 죽전점 (031)888-1234", "206-86-50913 강희석", // 문자를 출력해줍니다. 
				"용인 수지구 포은대로 552");
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가"); // 문자를 출력합니다. 
		System.out.printf("%s\n", "정상상품에 한함, 30일이내(신선 7일)"); // 문자를 출력합니다. 
		System.out.printf("%s\n", "*일부 브랜드매장 제외(매장 고지물참조)"); // 문자를 출력합니다. 
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)"); // 문자를 출력합니다. 
		System.out.printf("\n"); // 줄을 바꿔줍니다. 
		System.out.printf("%s%22s\n", "[구매]" + k17_sdt.format(k17_cal.getTime()), "POS:0011-9861"); 
		// k17_sdt.format(k17_cal.getTime())를 통해 실제 날짜와 시간을 구해줍니다. 
		System.out.printf("--------------------------------------------\n"); // -- 를 출력해줍니다. 
		System.out.printf("%7s%16s%5s%7s\n", "상 품 명", "단  가", "수량", "금  액"); // 문자열들을 출력해줍니다. 
		System.out.printf("--------------------------------------------\n"); // -- 를 출력해줍니다. 

		for (int k17_i = 0; k17_i < k17_itemname.length; k17_i++) {
			// 이 for문은 문자열들을 맞추기 위한 for문입니다. 
			// 일단 for문을 돌려 30번 반복할 수 있도록 설정해줍니다. 
			if (k17_itemname[k17_i].length() >= 7) { // 이 조건문은 만약 k17_itemname[k17_i]의 문자수가 7글자보다 많다면 
				k17_itemname[k17_i] = k17_itemname[k17_i].substring(0, 7); // k17_itemname[k17_i] 안에 substring을 통해 7글자까지만 저장한다는 뜻입니다. 
			}
			int k17_num1 = 14 - k17_itemname[k17_i].getBytes().length; 
			// 정수형 변수 k17_num1을 정의하고 14 - 방금 7글자만 저장한 값의 byte 수를 빼줍니다. 
			// 7글자로 잘랐을때의 기준에서 최대 byte가 한글 기준으로 (한글(2byte), 영어,숫자,기호(1byte)) 14byte이기에 14입니다. 
			for (int k17_j = 0; k17_j < k17_num1; k17_j++) { // 그래서 공백이 필요한 byte 수만큼 for문을 돌려줘 
				k17_itemname[k17_i] = k17_itemname[k17_i] + " "; // k17_itemname[k17_i] 안에 변수와 공백의 수를 저장해줍니다.
			}
			if (k17_taxfree[k17_i] == true) { // 이 조건문은 면세상품일때 *를 출력해주기 위한 조건문입니다. 
				System.out.printf("* %s%11s %6d %9s\n", k17_itemname[k17_i], k17_df.format(k17_price[k17_i]), k17_num[k17_i],
						k17_df.format(k17_price[k17_i] * k17_num[k17_i]));	
				// 그렇게 부울 자료형 배열에서 true인 값들은 *를 포함한채 출력되게 합니다. 
			} else if (k17_taxfree[k17_i] == false) { // 만약 부울 자료형 배열에서 false인 값들은 
				System.out.printf("  %s%11s %6d %9s\n", k17_itemname[k17_i], k17_df.format(k17_price[k17_i]), k17_num[k17_i],
						k17_df.format(k17_price[k17_i] * k17_num[k17_i]));
				// *값 대신 공백을 넣어 출력하게끔 해줍니다. 
			}
			if ((k17_i + 1) % 5 == 0) { // 그리고 마지막으로 다섯개의 상품 기준으로 -- 를 출력하기 위해 (k17_i + 1) % 5 한값이 0과 같을때   
				System.out.printf("--------------------------------------------\n"); // ---를 출력해줍니다. 
			}
		}
		int k17_total_num = 0; // 정수형 변수 k17_total_num 를 정의하고 0으로 초기화합니다. 
		for (int k17_i = 0; k17_i < k17_num.length; k17_i++) { // for 문을 돌려 모든 상품, 즉 30개의 상품 전부 돌아가게 합니다. 
			k17_total_num = k17_total_num + k17_num[k17_i]; // k17_total_num 총수량 변수 안에 수량들을 계속해서 더해줍니다. 
		}
		System.out.printf("%23s%16d\n", "총 품목 수량", k17_total_num); // 그리고 이러한 값들을 출력해줍니다. 

		int k17_total_taxfree = 0; // 정수형 변수 k17_total_taxfree를 정의하고 0으로 초기화해줍니다. 
		int k17_total_nontaxfree = 0; // 정수형 변수 k17_total_nontaxfree를 정의하고 0으로 초기화해줍니다. 
		for (int k17_i = 0; k17_i < k17_itemname.length; k17_i++) { // 마찬가지로 for문을 돌려 모든 상품(30개) 전부 돌 수 있도록 반복해줍니다. 
			if (k17_taxfree[k17_i] == true) { // 만약 면세상품일경우에
				k17_total_taxfree = k17_total_taxfree + (k17_price[k17_i] * k17_num[k17_i]); // k17_total_taxfree 안에 면세상품들의 가격들을 더해준뒤 총 가격을 저장해줍니다.  
			} else { // 만약 면세상품이 아닐 경우에는 
				k17_total_nontaxfree = k17_total_nontaxfree + (k17_price[k17_i] * k17_num[k17_i]); 
				// k17_total_nontaxfree 안에 과세상품들의 가격들을 더해준뒤 총 가격을저장해줍니다. 
			}
		}
		System.out.printf("%24s%16s\n", "(*)면 세  물 품", k17_df.format(k17_total_taxfree)); //k17_df.format을 통해 콤마를 찍어주고 값을 출력해줍니다.  
		System.out.printf("%23s%16s\n", "	과 세  물 품", k17_df.format(k17_total_nontaxfree)); //k17_df.format을 통해 콤마를 찍어주고 값을 출력해줍니다. 

		double k17_tax_rate = 0.1; // 실수형 변수 k17_tax_rate을 정의해주고 0.1을 저장해줍니다. 
		int k17_tax = (int) (k17_total_nontaxfree * k17_tax_rate); 
		// 정수형 변수 k17_tax를 정의해주고 안에 정수형으로 받은 k17_total_nontaxfree * k17_tax_rate의 값을 저장해줍니다. 
		System.out.printf("%25s%16s\n", "부   가   세", k17_df.format(k17_tax)); // 변수의 값을 출력해줍니다. 

		int k17_total_price = 0; // 정수형 변수 k17_total_price을 정의해주고 0으로 초기화해줍니다. 
		k17_total_price = k17_total_taxfree + k17_total_nontaxfree + k17_tax;
		// k17_total_price 안에 모든 변수들의 더한 값을 저장해줍니다. 
		System.out.printf("%26s%16s\n", "합        계", k17_df.format(k17_total_price)); // 콤마를 찍고 변수들을 출력해줍니다. 
		System.out.printf("%s%27s\n", "결 제 대 상 금 액", k17_df.format(k17_total_price)); // 콤마를 찍고 변수들을 출력해줍니다. 
		System.out.printf("--------------------------------------------\n"); // -- 를 출력해줍니다. 
		System.out.printf("%s%31s\n", "0012 KEB 하나", "541707**0484/35860658"); // 문자들을 출력합니다. 
		System.out.printf("%s%29s\n", "카드결제(IC)", "일시불 / " + k17_df.format(k17_total_price)); // 변수와 문자들을 출력해줍니다. 
		System.out.printf("--------------------------------------------\n"); // -- 를 출력해줍니다. 
		System.out.printf("%23s\n", "[신세계포인트 적립]"); // 문자를 출력해줍니다. 
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다."); // 문자를 출력해줍니다. 
		System.out.printf("%s%20s%10s\n", "금화발생포인트", "9350**9995", "164"); // 문자들을 출력해줍니다. 
		System.out.printf("%s%18s%10s\n", "누계(기용)포인트", "5,637(", "5,473)"); // 문자들을 출력해줍니다.
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다."); // 문자를 출력해줍니다. 
		System.out.printf("--------------------------------------------\n"); // --를 출력해줍니다. 
		System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여"); // 문자들을 출력해줍니다. 
		System.out.printf("%s%32s\n", "차량번호 : ", "34저****"); // 문자들을 출력해줍니다. 
		SimpleDateFormat k17_sdt1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); 
		// 여기에서 다시한번 날짜형식을 지정해주는 이유는 앞서 있던 날짜형식과 현재 하는 날짜 형식이 다르기때문입니다. 
		System.out.printf("%s%33s\n", "입차시간 : ", k17_sdt1.format(k17_cal.getTime())); // 형식을 바꾼 날짜를 출력해줍니다. 
		System.out.printf("--------------------------------------------\n"); // -- 를 출력합니다. 
		System.out.printf("%s%28s\n", "캐셔:084599 양00", "1150"); // 문자를 출력해줍니다. 
		System.out.printf("%40s\n", "|||||||||||||||||||||||||||||||||||"); // 바코드를 출력해줍니다. 
		SimpleDateFormat k17_sdt2 = new SimpleDateFormat("YYYYMMdd"); // 또다른 형식의 날짜 형식입니다. 
		System.out.printf("%37s", k17_sdt2.format(k17_cal.getTime()) + "/00119861/00164980/31"); // 다른 날짜 형식을 출력해줍니다. 
	}
}
