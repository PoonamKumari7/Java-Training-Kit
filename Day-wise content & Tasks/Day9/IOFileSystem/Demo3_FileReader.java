package techment.Day9.IOFileSystem;

import java.io.FileReader;
import java.io.IOException;

public class Demo3_FileReader {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("2abc.txt");

		//reading char one by one of existing file
		System.out.println((char)fr.read()); 
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read()); 

		//if char ends prints '?'

		/*****************************************************/

		//reading char of existing file using loop
		int ch = fr.read();
		System.out.println(ch);

		while(ch!= -1)
		{
			System.out.println(ch);
			ch = fr.read();
		}

	}
}