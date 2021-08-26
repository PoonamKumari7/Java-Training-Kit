package techment.Day9.IOFileSystem;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("1abc.txt");

		fw.write("Hello");
		fw.write(92);
		fw.write(98);
		fw.write("Written Successfully...");

		/**************************************************************/
		fw.write("Hello \n");    //new line char doesn't work in all editors
		fw.write(92);
		fw.write(98);

		System.out.println("Written 1st time Successfully...");


		/************************************************************/
		fw.write("Hi \n");
		fw.write("Welcome \n");    

		System.out.println("Written 2nd time Successfully...");

		fw.close();

	}
}
