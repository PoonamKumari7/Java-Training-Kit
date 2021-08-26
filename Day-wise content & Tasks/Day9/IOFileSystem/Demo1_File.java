package techment.Day9.IOFileSystem;

import java.io.File;
import java.io.IOException;

/**
 * @author POONAM
 * if don't give path with file name, by default save to the current working (project) folder
 */

public class Demo1_File {

	public static void main(String[] args) throws IOException {

		File file1 = new File("1abc.txt");       //check this text file exists or not
		System.out.println(file1.exists());   

		file1.createNewFile();				//create new file 
		System.out.println(file1.exists());

		File file2 = new File("2abc.txt");
		file2.createNewFile();				//create new file 
		System.out.println(file2.exists());

		/***********************************************************************************************/
		File file3 = new File("c:\\Users\\Techment\\FolderCreation"); //create folder on that path
		file3.mkdir();	
		System.out.println(file3.exists());


		File file4 = new File("c:\\Users\\Techment\\FolderCreation\\def.txt");
		file4.createNewFile();
		System.out.println(file4.exists()); 


		File file5 = new File("c:\\Users\\Techment\\FolderCreation");
		file5.createNewFile();
		file5.delete();             //delete folder on that path	

	}
}

