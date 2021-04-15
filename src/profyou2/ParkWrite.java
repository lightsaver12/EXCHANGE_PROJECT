package profyou2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ParkWrite {

	public void report (String temp133) throws IOException {
		BufferedWriter bw = new BufferedWriter
				(new OutputStreamWriter(new FileOutputStream("C:\\Users\\송준석\\Desktop\\Amusement Park.txt", true),"MS949"));
		//FileWriter fw = new FileWriter("C:\\Users\\송준석\\Desktop\\Amusement Park.txt", true);
		String data1 = "Date, PassType, AgeGroup, Amount, Price, PreferentialTreatment\n";
		bw.write(data1);
		bw.write(temp133);
		bw.close();
	}

}
