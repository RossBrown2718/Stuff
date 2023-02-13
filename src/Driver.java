import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub
			ints();
			doubles();
			booleans();
		}
	public static void ints() throws FileNotFoundException {
		File txt = new File("ints.txt");
		Scanner scnr = new Scanner(txt);
		double sum = 0;
		double num = 0;
		while (scnr.hasNextLine()) {
			sum += Integer.parseInt(scnr.nextLine());
			num++;
		} scnr.close();
		System.out.print("Average of ints : " + sum / num + "\n");
	}
	public static void doubles() throws FileNotFoundException {
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
	public static void booleans() throws FileNotFoundException {
		File txt = new File("boolean.txt");
		Scanner scnr = new Scanner(txt);
		boolean[][] res = new boolean[8][8];
		int row = 0, col = 0;
		while (scnr.hasNextLine()) {
			String j = scnr.nextLine();
			for (int i = 0; i < 8; i++) {
				res[row][i] = j.substring(i,i+1).equals("0")? false: true;
			} row++;
		} scnr.close();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(res[i][j] + "\t");
			} System.out.print("\n");
		}
	}

}
