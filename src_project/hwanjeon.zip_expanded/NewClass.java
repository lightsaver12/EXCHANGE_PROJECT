import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.FileWriter;

public class NewClass {
	
	SimpleDateFormat sdf = new SimpleDateFormat("YYMMdd,HHmm");
	Calendar cal = Calendar.getInstance();
	DecimalFormat df = new DecimalFormat("###,###,###,###,###");
	//OutputClass runClass = new OutputClass();
	
	public void writeUSD(int moneyKOR, int returnRealUSD) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Hwanjeon.txt", true);
		String data = sdf.format(cal.getTime()) + "," + moneyKOR + "," + "USD," + returnRealUSD + ",";
		fw.write(data);
		fw.close();
	}

	public void writeEUR(int moneyKOR, int returnRealEUR) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Hwanjeon.txt", true);
		String data = sdf.format(cal.getTime()) + "," + moneyKOR + "," + "EUR," + returnRealEUR + ",";
		fw.write(data);
		fw.close();
	}

	public void writeYEN(int moneyKOR, int returnRealJPY) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Hwanjeon.txt", true);
		// temp = runClass.printBalanceJPY(balanceJPY);
		String data = sdf.format(cal.getTime()) + "," + moneyKOR + "," + "JPY," + returnRealJPY + ",";
		fw.write(data);
		fw.close();
	}

	public void writeKOR(int change) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Hwanjeon.txt", true);
		String data = change + "," + ConstValueClass.BALANCE_USD  + "," + ConstValueClass.BALANCE_EUR  + "," + 
		ConstValueClass.BALANCE_JPY + "\n";
		fw.write(data);
		fw.close();
	}
}