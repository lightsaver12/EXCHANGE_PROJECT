import java.util.Scanner;

public class InputClass {
	private Scanner sc = null;
	
	public InputClass() {
		sc = new Scanner(System.in);
	}
	
	public int inputFromConsoleWon() {
		int moneyKOR;
		String won = "won : ";
		System.out.println("won : ");	
		moneyKOR = sc.nextInt();
		return moneyKOR;
	}
	public int inputFromConsoleType() {
		int inputChangeType;
		String menu = "Which money do you want?\n + 1.USD\n +2.EUR\n + 3.JPY\n + 0.Exit";
		System.out.println("Which money do you want?\n"
				+ "1.USD\n\n"  
				+ "2.EUR\n\n"
				+ "3.JPY\n\n"
				+ "0.Exit");
		inputChangeType = sc.nextInt();
		return inputChangeType;
	}
}
