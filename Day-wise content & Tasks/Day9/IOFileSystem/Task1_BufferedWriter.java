package techment.Day9.IOFileSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task1_BufferedWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("2abc.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(100);
		bw.newLine();

		char[] ch={'a','b','c','d'};

		bw.write(ch);
		bw.newLine();

		bw.write("Poonam Kumari");
		bw.newLine();
		bw.write("Techment Technology");

		//bw.flush();
		bw.close();


	}

}
