import java.io.IOException;

public class OutputClass {
	private NewClass writeprint = null;
	
	public OutputClass() {
		writeprint = new NewClass();
	}

	private void printResultUSD(int returnRealUSD, int outputUSD100, int outputUSD50, int outputUSD20, int outputUSD10, int outputUSD5,
			int outputUSD2, int outputUSD1) {
		System.out.println(returnRealUSD + " dollar");
		System.out.println("100 dollar bill: " + outputUSD100);
		System.out.println("50 dollar bill: " + outputUSD50);
		System.out.println("20 dollar bill: " + outputUSD20);
		System.out.println("10 dollar bill: " + outputUSD10);
		System.out.println("5 dollar bill: " + outputUSD5);
		System.out.println("2 dollar bill: " + outputUSD2);
		System.out.println("1 dollar bill:  " + outputUSD1);
	}

	private void printResultEUR(int returnRealEUR, int outputEUR500, int outputEUR100, 
							int outputEUR50, int outputEUR20, int outputEUR10, 
							int outputEUR5, int outputEUR2, int outputEUR1) {
		System.out.println(returnRealEUR + "euro");
		System.out.println("500 euro bill: " + outputEUR500);
		System.out.println("100 euro bill: " + outputEUR100);
		System.out.println("50 euro bill: " + outputEUR50);
		System.out.println("20 euro bill: " + outputEUR20);
		System.out.println("10 euro bill: " + outputEUR10);
		System.out.println("5 euro bill: " + outputEUR5);
		System.out.println("2 euro bill: " + outputEUR2);
		System.out.println("1 euro bill: " + outputEUR1);
	}
	
	private void printResultJPY(int returnRealJPY, int outputJPY10000, int outputJPY5000, 
						int outputJPY2000, int outputJPY1000) {
		System.out.println(returnRealJPY + "yen");
		System.out.println("10000 yen bill: " + outputJPY10000);
		System.out.println("5000 yen bill: " + outputJPY5000);
		System.out.println("2000 yen bill: "+ outputJPY2000);
		System.out.println("1000 yen bill: " + outputJPY1000);
	}
	
	private void printResultWon(int change, int returnWon5000, int returnWon1000, int returnWon500, int returnWon100, int returnWon50,
			int returnWon10) {
		System.out.println("\nChange = " + change + " won ");
		System.out.println("5000 won : " + returnWon5000);
		System.out.println("1000 won : " + returnWon1000);
		System.out.println("500 won : " + returnWon500);
		System.out.println("100 won :  " + returnWon100);
		System.out.println("50 won : " + returnWon50);
		System.out.println("10 won : " + returnWon10);
	}
	
	public void printErrorMessage(int errorCode) {
		switch(errorCode) {
			case ConstValueClass.ERR_BALANCE_USD:
				System.out.println( "Not enough dollar to Withdraw");
				break;
			case ConstValueClass.ERR_BALANCE_EUR:
				System.out.println("Not enough euro to Withdraw");
				break;
			case ConstValueClass.ERR_BALANCE_JPY:
				System.out.println("Not enough yen to Withdraw");
				break;
		}
	}
	
	public void printBalanceUSD(double balanceUSD) {
		System.out.println("dollar left in the ATM :" + balanceUSD);
	}
	public void printBalanceEUR(double balanceEUR) {
		System.out.println("euro left in the ATM :" + balanceEUR);
	}
	public void printBalanceJPY(double balanceJPY) {
		System.out.println("yen left in the ATM :" + balanceJPY);
	}
	

	public void outputResultUSD(int moneyKOR, int returnRealUSD) throws IOException {
		int outputUSD100, outputUSD50, outputUSD20, outputUSD10;
		int outputUSD5, outputUSD2, outputUSD1;

		outputUSD100 = (returnRealUSD / ConstValueClass.CHANGE_USD_100);
		outputUSD50 = ((returnRealUSD % ConstValueClass.CHANGE_USD_100)) / 50;
		outputUSD20 = (((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) / 20;
		outputUSD10 = ((((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) % 20) / 10;
		outputUSD5 = (((((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) % 20) % 10) / 5;
		outputUSD2 = ((((((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) % 20) % 10) % 5) / 2;
		outputUSD1 = (((((((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) % 20) % 10) % 5) % 2);

		printResultUSD(returnRealUSD, outputUSD100, outputUSD50, outputUSD20, outputUSD10, outputUSD5, outputUSD2, outputUSD1);
		writeprint.writeUSD(moneyKOR, returnRealUSD);
	}

	public void outputResultEUR(int moneyKOR, int returnRealEUR) throws IOException {
		int outputEUR500, outputEUR100, outputEUR50, outputEUR20, outputEUR10;
		int	outputEUR5, outputEUR2, outputEUR1;
		
		outputEUR500 = (returnRealEUR / ConstValueClass.CHANGE_EUR_500);
		outputEUR100 = (returnRealEUR % ConstValueClass.CHANGE_EUR_500) / 100;
		outputEUR50 = ((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) / 50;		
		outputEUR20 = (((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) % 50) / 20;		
		outputEUR10 = ((((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) % 50) % 20) / 10;		
		outputEUR5 = (((((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) % 50) % 20) % 10) / 5;		
		outputEUR2 = ((((((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) % 50) % 20) % 10) % 5) / 2;
		outputEUR1 = (((((((returnRealEUR % ConstValueClass.CHANGE_EUR_500) % 100) % 50) % 20) % 10) % 5) % 2);
		
		printResultEUR(returnRealEUR, outputEUR500, outputEUR100, outputEUR50, outputEUR20, outputEUR10, outputEUR5, outputEUR2, outputEUR1);
		writeprint.writeEUR(moneyKOR, returnRealEUR);
	}


	public void outputResultJPY(int moneyKOR, int returnRealJPY) throws IOException {
		int outputJPY10000, outputJPY5000, outputJPY2000, outputJPY1000;		
		outputJPY10000 = (returnRealJPY / ConstValueClass.CHANGE_YEN_10000);
		outputJPY5000 = (returnRealJPY % ConstValueClass.CHANGE_YEN_10000) / 5000;
		outputJPY2000 = ((returnRealJPY % ConstValueClass.CHANGE_YEN_10000) % 5000) / 2000;
		outputJPY1000 = (((returnRealJPY % ConstValueClass.CHANGE_YEN_10000) % 5000) % 2000) / 1000;
		
		printResultJPY(returnRealJPY, outputJPY10000, outputJPY5000, outputJPY2000, outputJPY1000);
		writeprint.writeYEN(moneyKOR, returnRealJPY);
	}

	public void outputResultWon(int change) throws IOException {
		int returnWon5000, returnWon1000, returnWon500, returnWon100, returnWon50, returnWon10;
		returnWon5000 = change / 5000;
		returnWon1000 = (change % 5000) / 1000;
		returnWon500 = ((change % 5000) % 1000) / 500;
		returnWon100 = (((change % 5000) % 1000) % 500) / 100;
		returnWon50 = ((((change % 5000) % 1000) % 500) % 100) / 50;
		returnWon10 = (((((change % 5000) % 1000) % 500) % 100) % 50) / 10;

		printResultWon(change, returnWon5000, returnWon1000, returnWon500, returnWon100, returnWon50, returnWon10);
		writeprint.writeKOR(change);
	}
}
