package Day21.File.Handeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadandWriteNewFile {
	public static void main(String[]args) throws IOException {
		File English = new File("D:\\Read_News\\Englis_Articles.txt");
		Scanner Sankar = new Scanner(English);
		
		String NewFile="Hi ";
		while (Sankar.hasNextLine()) {
			NewFile = NewFile.concat(Sankar.nextLine() + "\n");
		}
		FileWriter write = new FileWriter("D:\\Read_News\\Englis_Articles1.txt");
		write.write(NewFile);
		write.append("Hi My Name is ");
		write.append(NewFile);
		write.append(NewFile, 3, 5);
		write.flush();
		write.equals(English);
		System.out.println(write.equals(English));
		write.close();
		
	}

}
