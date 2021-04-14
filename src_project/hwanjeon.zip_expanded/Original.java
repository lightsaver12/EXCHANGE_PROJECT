import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.FileWriter;

public class Original {

	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	Calendar cal = Calendar.getInstance();
	DecimalFormat df = new DecimalFormat("###,###,###,###,###");

	public void writeUSD(int moneyKOR, int returnRealUSD, int outputUSD100, int outputUSD50, int outputUSD20,
			int outputUSD10, int outputUSD5, int outputUSD2, int outputUSD1) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Hwanjeon.txt", true);
		String data = sdf.format(cal.getTime()) + "\n환전 원 : " + df.format(moneyKOR) + " 원" + "\n환전된 달러 : "
				+ df.format(returnRealUSD) + " dollar" + "\n100 dollar : " + outputUSD100 + "\n50 dollar : "
				+ outputUSD50 + "\n20 dollar : " + outputUSD20 + "\n10 dollar : " + outputUSD10 + "\n5 dollar : "
				+ outputUSD5 + "\n2 dollar : " + outputUSD2 + "\n1 dollar : " + outputUSD1 + "\n\n";
		fw.write(data);
		fw.close();
	}

	public void writeEUR(int moneyKOR, int returnRealEUR, int outputEUR500, int outputEUR100, int outputEUR50,
			int outputEUR20, int outputEUR10, int outputEUR5, int outputEUR2, int outputEUR1) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Hwanjeon.txt", true);
		String data = sdf.format(cal.getTime()) + "\n환전 원 : " + df.format(moneyKOR) + " 원" + "\n환전된 유로 : "
				+ df.format(returnRealEUR) + " euro" + "\n500 euro : " + outputEUR500 + "\n100 euro : " + outputEUR100
				+ "\n50 euro : " + outputEUR50 + "\n20 euro : " + outputEUR20 + "\n10 euro : " + outputEUR10
				+ "\n5 euro : " + outputEUR5 + "\n2 euro : " + outputEUR2 + "\n1 euro : " + outputEUR1 + "\n\n";
		fw.write(data);
		fw.close();
	}

	public void writeYEN(int moneyKOR, int returnRealJPY, int outputJPY10000, int outputJPY5000, int outputJPY2000,
			int outputJPY1000) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Hwanjeon.txt", true);
		String data = sdf.format(cal.getTime()) + "\n환전 원 : " + df.format(moneyKOR) + " 원" + "\n환전된 옌 : "
				+ df.format(returnRealJPY) + " yen" + "\n10000 yen : " + outputJPY10000 + "\n5000 yen : "
				+ outputJPY5000 + "\n2000 yen : " + outputJPY2000 + "\n1000 yen : " + outputJPY1000 + "\n\n";
		fw.write(data);
		fw.close();
	}

	public void writeKOR(int change, int returnWon5000, int returnWon1000, int returnWon500, int returnWon100, int returnWon50,
			int returnWon10) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Hwanjeon.txt", true);
		String data = sdf.format(cal.getTime()) + "\n거스름돈 : " + df.format(change) + " 원" + "\n5000 원 : " + returnWon5000 + "\n1000 원 : " + returnWon1000
				+ "\n500 원 : " + returnWon500 + "\n100 원 : " + returnWon100 + "\n50 원 : " + returnWon50 + "\n10 원 : "
				+ returnWon10 + "\n";
		fw.write(data);
		fw.close();
	}
}