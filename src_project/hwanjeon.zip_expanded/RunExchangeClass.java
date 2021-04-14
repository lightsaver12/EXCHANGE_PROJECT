import java.io.IOException;

public class RunExchangeClass {
	private OutputClass outClass = null;
	public RunExchangeClass() {
		outClass = new OutputClass();
	}

	private boolean checkBalanceUSD(int requestUSD) {
		if (requestUSD <= ConstValueClass.BALANCE_USD) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkBalanceEUR(int requestEUR) {
		if (requestEUR <= ConstValueClass.BALANCE_EUR) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkBalanceJPY(int requestJPY) {
		if (requestJPY <= ConstValueClass.BALANCE_JPY) {
			return true;
		} else {
			return false;
		}
	}

	public void changeToUSD(int moneyKOR) throws IOException {
		double returnUSD;
		int returnRealUSD;
		int change;
		returnUSD = moneyKOR / ConstValueClass.EX_USD;
		returnRealUSD = (int) returnUSD;
		if (checkBalanceUSD(returnRealUSD)) {
			outClass.outputResultUSD(moneyKOR, returnRealUSD);

			change = (int) (moneyKOR - returnRealUSD * ConstValueClass.EX_USD);
			change = (change / 10) * 10;

			ConstValueClass.BALANCE_USD -= returnRealUSD;
			outClass.outputResultWon(change);
			outClass.printBalanceUSD(ConstValueClass.BALANCE_USD);
		} else {
			outClass.printErrorMessage(ConstValueClass.ERR_BALANCE_USD);
		}
	}

	public void changeToEUR(int moneyKOR) throws IOException {
		double returnEUR;
		int returnRealEUR;
		int change;
		
		returnEUR = moneyKOR / ConstValueClass.EX_EUR;
		returnRealEUR = (int)returnEUR;		
		
		if (checkBalanceEUR(returnRealEUR)) { 
			outClass.outputResultEUR(moneyKOR, returnRealEUR);
		
			change = (int) (moneyKOR - returnRealEUR * ConstValueClass.EX_EUR);
			change = (change / 10) * 10;  	
		
			ConstValueClass.BALANCE_EUR -= returnRealEUR;
			outClass.outputResultWon(change);	
			outClass.printBalanceEUR(ConstValueClass.BALANCE_EUR);
		} else { 
			outClass.printErrorMessage(ConstValueClass.ERR_BALANCE_EUR);
		}
	}
	
	public void changeToJPY(int moneyKOR) throws IOException {
		double returnJPY;
		int returnRealJPY;
		int change;
		returnJPY = moneyKOR / ConstValueClass.EX_JPY;
		returnRealJPY = (int)(returnJPY - (returnJPY % 1000));

		if (checkBalanceJPY(returnRealJPY)) {
			outClass.outputResultJPY(moneyKOR, returnRealJPY);
			change = (int) (moneyKOR - (returnRealJPY * ConstValueClass.EX_JPY));

			ConstValueClass.BALANCE_JPY -= returnRealJPY;
			outClass.outputResultWon(change);
			
			outClass.printBalanceJPY(ConstValueClass.BALANCE_JPY);
		} else {
			outClass.printErrorMessage(ConstValueClass.ERR_BALANCE_JPY);
		}
	}
}
