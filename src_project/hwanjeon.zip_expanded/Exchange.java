import java.io.FileWriter;
import java.io.IOException;

public class Exchange {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int moneyKOR = 0;
		int inputChangeType = 0;
		FileWriter fw = null;
		fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Hwanjeon.txt", true);
		//String data1 = "날짜, 시간, 환전할원화, 화폐, 환전한액수, 거스름돈, 남은달러잔액, 남은유로잔액, 남은옌잔액"+"\n";
		String data1 = "date, time, yourwon, currency, whatyouget, changewon, leftUSD, leftEUR, leftJPY"+"\n";
		fw.write(data1);
		fw.close();
		InputClass inputClass = new InputClass();
		do {
			//fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Hwanjeon.txt", true);
			moneyKOR = inputClass.inputFromConsoleWon();
			inputChangeType = inputClass.inputFromConsoleType();
			RunExchangeClass runClass = new RunExchangeClass();
			switch (inputChangeType) {
				case ConstValueClass.CHANGE_TYPE_USD:
					runClass.changeToUSD(moneyKOR);
					break;
				case ConstValueClass.CHANGE_TYPE_EUR:
					runClass.changeToEUR(moneyKOR);
					break;
				case ConstValueClass.CHANGE_TYPE_JPY:
					runClass.changeToJPY(moneyKOR);
					break;
			} //fw.close();
		}while (inputChangeType != 0);
	} 
}







