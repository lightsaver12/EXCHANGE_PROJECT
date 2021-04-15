package profyou2;

public class ParkOutput {

	public void price (int Price) {
		System.out.println("가격은 " + Price+ "원 입니다.\n감사합니다.");
	}
	
	public void totalprice (int Price) {
		System.out.println("티켓 발권을 종료합니다. 감사합니다.\n");
		System.out.println("================== 에버랜드 ===================");
	}
	
	public void totalprice2 (int sum) {
		
		System.out.println("\n입장료 총액은 " + sum + "원 입니다.");
		System.out.println("===============================================\n");
	}
}