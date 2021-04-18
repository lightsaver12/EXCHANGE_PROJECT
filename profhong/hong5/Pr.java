package hong5;

public class Pr {

	public static void main(String[] args) {

		String [] a = {"나는123딸기", "나는456바나나"};
		for (int i = 0; i <= a.length; i++) {
		if (a[i].length() >= 5) {
			a[i] = a[i].substring(0, 5);
			int number = 10 - a[i].getBytes().length;
			for (int j = 0; j < number; j++) {
				a[i] = a[i] + "*";
			}
		}
		System.out.println(a[i]);
	}
}
}