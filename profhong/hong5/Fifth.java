package hong5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fifth {

	public static int netprice(int k17_price, double k17_rate) { //k17_netprice라는 메소드를 생성하고 안에 parameter 를 정수형 변수 k17_price 와 실수형 변수 k17_rate을 사용합니다.
		return (int)(k17_price/(1+ k17_rate)); // 정수형으로 받은 k17_Price 나누기 (1+k17_rate)의 값을 리턴합니다.
	}
	
	public static void main(String[] args) {
		
		DecimalFormat k17_df = new DecimalFormat("###,###,###,###,###"); // 콤마를 구하기 위한 식입니다. 
		Calendar k17_cal = Calendar.getInstance(); // 실제 날짜, 시간을 구하기 위한 식입니다. 
		SimpleDateFormat k17_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 실제 날짜, 시간을 원하는 방식으로 지정하는 식입니다. 
		
		String k17_itemname1 = "퓨어에어 비말차단용마스크(최고급행)"; // 문자형 클래스 k17_itemname1 을 정의하고 안에 문자열을 저장해줍니다. 
		String k17_itemcode1 = "[1031615]"; // 문자형 클래스 k17_itemcode1을 정의하고 안에 문자열을 저장해줍니다. 
		int k17_price1 = 3000; // 정수형 변수 k17_price1을 정의하고 3000을 저장해줍니다. 
		int k17_amount1 = 1; // 정수형 변수 k17_amount1을 정의하고 1을 저장해줍니다. 
		
		String k17_itemname2 = "슬라이드식명창(가로명)(100호)"; // 문자형 클래스 k17_itemname2 을 정의하고 안에 문자열을 저장해줍니다. 
		String k17_itemcode2 = "[11008152]"; // 문자형 클래스 k17_itemcode2을 정의하고 안에 문자열을 저장해줍니다.
		int k17_price2 = 1000; // 정수형 변수 k17_price2을 정의하고 1000을 저장해줍니다. 
		int k17_amount2 = 1; // 정수형 변수 k17_amount2을 정의하고 1을 저장해줍니다. 
		
		String k17_itemname3 = "매직흡착 인테리어후크(알루미늄타입)"; // 문자형 클래스 k17_itemname3 을 정의하고 안에 문자열을 저장해줍니다.
		String k17_itemcode3 = "[1020800]"; // 문자형 클래스 k17_itemcode3을 정의하고 안에 문자열을 저장해줍니다.
		int k17_price3 = 1000; // 정수형 변수 k17_price3을 정의하고 1000을 저장해줍니다. 
		int k17_amount3 = 1; // 정수형 변수 k17_amount3을 정의하고 1을 저장해줍니다. 
		
		int k17_price = 0; // 정수형 변수 k17_price 를 정의하고 0으로 초기화합니다. 
		k17_price = (int)((k17_price1*k17_amount1)+(k17_price2*k17_amount2)+(k17_price3*k17_amount3));
		// k17_price 변수안에 정수로 받은 각 변수들의 가격과 수량을 곱하고 총 가격을 구해줍니다. 
		double k17_tax_rate = 0.1; // 실수형 변수 k17_tax_rate을 정의하고 0.1을 저장해줍니다. 
		
		int k17_netprice = netprice(k17_price, k17_tax_rate); // 정수형 변수 k17_netprice를 정의하고 안에 netprice 메소드의 변수들을 사용해주고 결과값을 저장해줍니다., 
		int k17_tax = k17_price - k17_netprice; // 정수형 변수 k17_tax를 정의하고 안에 k17_price - k17_netprice의 값을 저장해줍니다. 
		
		System.out.printf("%25s\n", "\"국민가게, 다이소\""); // %25s\n은 25칸만큼의 간격을 주고 줄을 바꾼다는 의미입니다. \"의 의미는 "를 출력하기 위함입니다. 
		System.out.printf("%s\n", "(주)아성다이소_분당서현점"); // 문자를 출력해줍니다. 
		System.out.printf("%s\n", "전화:031-702-6016"); // 문자를 출력해줍니다. 
		System.out.printf("%s\n", "본사:서울 강남구 남부순환로 2748 (도곡동)"); // 문자를 출력해줍니다. 
		System.out.printf("%s\n", "대표:박정부,신호섭 213-81-52063"); // 문자를 출력해줍니다. 
		System.out.printf("%s\n%s\n", "매장:경기도 성남시 분당구 분당로53번길 11 (서현","동)"); // 문자를 출력해줍니다. 
		System.out.printf("================================================\n"); // == 를 출력해줍니다. 
		System.out.printf("%26s\n%28s\n", "소비자중심경영(CCM) 인증기업", "ISO 9001 품질경영시스템 인증기업"); // 문자를 출력합니다. 
		System.out.printf("================================================\n"); // == 를 출력합니다. 
		System.out.printf("%29s\n%28s\n%26s\n%26s\n", "교환/환불 14일(03월24일)이내,", "(전자)영수증, 결제카드 지참 후 구입매장에서 가능", 
							"포장/가격 택 훼손시 교환/환불 불가", "체크카드 취소 시 최대 7일 소요"); // 문자를 출력합니다. 
		System.out.printf("================================================\n"); // == 를 출력합니다. 
		System.out.printf("%s%35s\n", "[POS 1058231]", k17_sdt.format(k17_cal.getTime())); // k17_sdt.format(k17_cal.getTime())를 통해 실제 날짜 시간을 구하고 출력해줍니다.
		System.out.printf("================================================\n"); // == 를 출력해줍니다. 
		System.out.printf("%1.14s%8s%5d%9s\n%s\n", k17_itemname1, k17_df.format(k17_price1), k17_amount1, k17_df.format(k17_price1*k17_amount1), k17_itemcode1);
		// ex) %1.14s 가 뜻하는 것은 1만큼의 간격을 부여하고 문자 14번째자리까지 출력하고 뒤는 생략한다는 뜻입니다. 
		// 그리고 각각의 값들을 출력해줍니다. 
		System.out.printf("%1.14s%10s%5d%9s\n%s\n", k17_itemname2, k17_df.format(k17_price2), k17_amount2, k17_df.format(k17_price2*k17_amount2), k17_itemcode2);
		// 마찬가지로 출력합니다. 
		System.out.printf("%1.14s%8s%5d%9s\n%s\n", k17_itemname3, k17_df.format(k17_price3), k17_amount3, k17_df.format(k17_price3*k17_amount3), k17_itemcode3);
		// 또한 마찬가지로 출력합니다. 
		System.out.printf("%18s%26s\n", "과세합계", k17_df.format(k17_netprice)); // 콤마를 구하기 위해 k17_df.format를 사용하고 변수의 값을 출력해줍니다. 
		System.out.printf("%19s%26s\n", "부가세", k17_df.format(k17_tax)); // 콤마를 구하기 위해 k17_df.format를 사용하고 변수의 값을 출력해줍니다.
		System.out.printf("------------------------------------------------\n"); // --를 출력합니다. 
		System.out.printf("%s%40s\n", "판매합계", k17_df.format(k17_price)); // 콤마를 구하기 위해 k17_df.format를 사용하고 변수의 값을 출력해줍니다.
		System.out.printf("================================================\n"); // ==를 출력합니다. 
		System.out.printf("%s%40s\n", "신용카드", k17_df.format(k17_price)); // 콤마를 구하기 위해 k17_df.format를 사용하고 변수의 값을 출력해줍니다.
		System.out.printf("------------------------------------------------\n"); // --를 출력합니다. 
		System.out.printf("%s%40s\n", "우리카드", "538720**********"); // 문자를 출력합니다. 
		System.out.printf("%s%24s\n", "승인번호 77982843(0)", "승인금액 "+k17_df.format(k17_price)); // 콤마를 구하기 위해 k17_df.format를 사용하고 변수의 값을 출력해줍니다.
		System.out.printf("================================================\n"); // ==를 출력합니다. 
		System.out.printf("%28s%s\n", k17_sdt.format(k17_cal.getTime()), " 분당서현점"); // 시간을 구하기 위해 k17_sdt.format(k17_cal.getTime())을 사용하고 시간과 문자를 출력합니다. 
		System.out.printf("%s\n", "상품 및 기타 문의 : 1522-4400"); // 문자를 출력합니다. 
		System.out.printf("%s\n", "멤버십 및 샵다이소 관련 문의 : 1599-2211"); // 문자를 출력합니다. 
		System.out.printf("%33s\n", "|||||||||||||||||||"); // 바코드를 출력합니다. 
		System.out.printf("%31s\n", "211820610158231"); // 문자를 출력합니다. 
		System.out.printf("------------------------------------------------\n"); // --- 를 출력합니다. 
		System.out.printf("%27s\n%25s", "*다이소 멤버십 앱 또는 홈페이지에 접속하셔서", "회원가입 후 다양한 혜택을 누려보세요!*"); // 문자를 출력합니다. 
	}
}
