package hong5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fourth {

	public static int netprice(int k17_price, double k17_rate) { //k17_netprice라는 메소드를 생성하고 안에 parameter 를 정수형 변수 k17_price 와 실수형 변수 k17_rate을 사용합니다. 
		return (int) (k17_price/(1+ k17_rate)); // 정수형으로 받은 k17_Price 나누기 (1+k17_rate)의 값을 리턴합니다. 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_price = 33000; // 정수형 변수 k17_price를 정의하고 안에 33000원을 넣습니다. 
		double k17_tax_rate = 0.1; // 실수형 변수 k17_tax_rate 을 정의하고 0.1을 대입합니다. 
		
		int k17_netprice = netprice(k17_price, k17_tax_rate); // 정수형 변수 k17_netprice를 정의하고 안에 k17_netprice 메소드의 리턴 값을 넣습니다. 
		int k17_tax = k17_price - k17_netprice; // 정수형 변수 k17_tax를 정의하고 안에 k17_price - k17_netprice의 값을 넣습니다. 
		
		DecimalFormat k17_df = new DecimalFormat("###,###,###,###,###"); // 콤마를 구하기 위한 식입니다. 
		Calendar k17_cal = Calendar.getInstance(); // 실제 날짜, 시간을 구하기 위한 식입니다. 
		SimpleDateFormat k17_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 실제 날짜, 시간을 원하는 방식으로 지정하는 식입니다. 
		
		System.out.printf("%s\n", "신용승인"); // 문자열 클래스이므로 %s를 사용하고 \n을 통해 줄을 바꿉니다. 그리고 마지막에 원하는 문자열을 출력합니다. 
		System.out.printf("%s%5s%18s%5s\n","단말기 : ","2N6865898", "전표번호 : ", "0421218"); // 문자열 클래스이므로 s를 사용합니다. 
		System.out.printf("%s%5s\n", "가맹점 : ", "한양김치찌개"); // 마찬가지로 5칸의 간격을 주고 문자열을 출력합니다.
		System.out.printf("%s%5s\n%s\n", "주 소 : ","경기 성남시 분당구 황새울로351번길 10 .","1층"); // 문자 출력합니다. 
		System.out.printf("%s%2s\n", "대표자 : ", "유창신"); // 문자 출력합니다. 
		System.out.printf("%s%5s%19s%5s\n","사업자 : ", "752-53-00558","TEL : ", "7055695"); // 문자 출력합니다. 
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - \n"); // 문자출력합니다. 
		System.out.printf("%s%38s%s\n", "금  액", k17_df.format(k17_netprice), " 원"); // 콤마를 출력하기 위해 k17_df.format을 사용하고 k17_netprice를 출력합니다. 
		System.out.printf("%s%38s%s\n", "부가세", k17_df.format(k17_tax), " 원"); // 콤마를 출력하기 위해 k17_df.format을 사용하고 k17_netprice를 출력합니다.
		System.out.printf("%s%38s%s\n", "합  계", k17_df.format(k17_price), " 원"); // 콤마를 출력하기 위해 k17_df.format을 사용하고 k17_netprice를 출력합니다.
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - \n"); // - - 출력합니다. 
		System.out.printf("%s\n", "우리카드"); // 문자 출력합니다. 
		System.out.printf("%s%5s%11s\n", "카드번호 : ", "5387-20**-****-4613(S)", "일시불"); // 문자를 출력합니다. 
		System.out.printf("%s%5s\n", "거래일시 : ", k17_sdt.format(k17_cal.getTime())); // 시간을 구하기 위해 k17_sdt.format(k17_cal.getTime()) 을 사용하고 날짜시간을 구해줍니다. 
		System.out.printf("%s%5s\n", "승인번호 : ", "70404427"); // 문자를 출력합니다. 
		System.out.printf("%s%5s\n", "거래번호 : ", "357734873739"); // 문자를 출력합니다. 
		System.out.printf("%s%5s%13s%5s\n", "매입 : ", "비씨카드사", "가맹 : ", "720068568"); // 문자를 출력합니다. 
		System.out.printf("%s%5s\n", "알림 : ", "EDC매출표"); // 문자를 출력합니다. 
		System.out.printf("%s%5s\n", "문의 : ", "TEL)1544-4700"); // 문자를 출력합니다. 
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - \n"); // - - 를 출력합니다. 
		System.out.printf("%25s\n", "* 감사합니다 *"); // 문자를 출력합니다. 
		System.out.printf("%45s","표준V2.08_20200212"); // 문자를 출력합니다. 
	}
}
