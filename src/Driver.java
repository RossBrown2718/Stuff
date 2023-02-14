import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub
			ints();
			doubles();
			intStringDoubles();
			booleans();
		}
	public static void ints() throws FileNotFoundException { //returns average of ints
		File txt = new File("ints.txt");
		Scanner scnr = new Scanner(txt);
		double sum = 0;
		double num = 0;
		while (scnr.hasNextLine()) {
			sum += Double.parseDouble(scnr.nextLine());
			num++;
		} scnr.close();
		System.out.print("Average of ints : " + sum / num + "\n");
	}
	public static void doubles() throws FileNotFoundException { //returns average of doubles
		File txt = new File("stringDouble.txt");
		Scanner scnr = new Scanner(txt);
		double sum = 0;
		double num = 0;
		while (scnr.hasNextLine()) {
			String j = scnr.nextLine();
			sum += Double.parseDouble(j.substring(j.indexOf(" ") + 1));
			num++;
		} scnr.close();
		System.out.print("Average of doubles : " + sum / num + "\n");
	}
	public static void booleans() throws FileNotFoundException { //returns a 2d array of booleans
		File txt = new File("boolean.txt");
		Scanner scnr = new Scanner(txt);
		boolean[][] res = new boolean[9][9];
		int row = 0;
		while (scnr.hasNextLine()) {
			String j = scnr.nextLine();
			for (int i = 0; i < 9; i++) {
				res[row][i] = Integer.parseInt(j.substring(i,i+1)) % 2 == 0? false: true;
			} row++;
		} scnr.close();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(res[i][j] + "\t");
			} System.out.print("\n");
		}
	}
	public static void intStringDoubles() throws FileNotFoundException {
		File txt = new File("intStringDouble.txt");
		Scanner scnr = new Scanner(txt);
		double sum1 = 0, sum2 = 0,  num = 0;
		while (scnr.hasNextLine()) {
			String j = scnr.nextLine();
			sum1 += Double.parseDouble(j.substring(0,1));
			sum2 += Double.parseDouble(j.substring(j.indexOf(" ", 2) + 1));
			num++;
		} scnr.close();
		System.out.print("Average of first column : " + sum1 / num + "\n" + "Average of second column : " + sum2/num + "\n");
	}

}
