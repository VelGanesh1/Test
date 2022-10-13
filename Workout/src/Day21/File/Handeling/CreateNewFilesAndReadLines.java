package Day21.File.Handeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateNewFilesAndReadLines {
	public static void main(String[]args) throws FileNotFoundException {
		File file = new File("D:\\Read_News\\Englis_Articles.txt");
		Scanner Sankar = new Scanner(file);
		while (Sankar.hasNextLine()) {
			System.out.println(Sankar.nextLine());			
		}
	}
}
