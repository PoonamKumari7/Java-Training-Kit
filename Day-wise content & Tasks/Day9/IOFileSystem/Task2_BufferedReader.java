package techment.Day9.IOFileSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2_BufferedReader {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("2abc.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		
		br.close();
	}
}
