package techment.Assignment4_Collection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Exercise5_States {

	public static void main(String[] args) throws IOException {

		File file = new File("States.txt");
		System.out.println(file.exists());
		file.createNewFile();
		
		FileWriter fw = new FileWriter("States.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Karnataka");
		bw.newLine();
		bw.write("Punjab");
		bw.newLine();
		bw.write("Telangana");
		bw.newLine();
		bw.write("Maharashtra");
		bw.newLine();
		bw.write("TamilNadu");
		bw.newLine();
		bw.write("Uttar Pradesh");
		bw.newLine();
		bw.write("Punjab");
		bw.newLine();
		bw.write("Karnataka");
		bw.newLine();
		bw.write("Kerala");   
		bw.newLine();
		bw.write("Delhi");
		bw.newLine();
		bw.flush();
		bw.close();
		
		System.out.println("written successfully");
		
		FileReader fr = new FileReader("States.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		 LinkedHashSet<String> linkedset =  new LinkedHashSet<String>();
		
		while(line!=null)
		{	linkedset.add(line);
			System.out.println(line);
			line =br.readLine();			
		}
		br.close();
		System.out.println("linkedset "+linkedset);
		System.out.println("======================================================================");
		System.out.println("Total number of states : "+linkedset.size());
		System.out.println("======================================================================");
		System.out.println("Removed delhi from linkedset "+linkedset.remove("Delhi")+" \nafter removing delhi linkedset : "+linkedset);
		
		System.out.println("======================================================================");
		System.out.println("Display the states which have name starting with K");
		for(String  states : linkedset )
		{
			if(states.startsWith("K"))
			System.out.println(states);
			
		}
		
		System.out.println("======================================================================");
		System.out.println("Display the states in a sorted Order");
		
		 TreeSet<String> tree_set = new TreeSet<>(linkedset);
		
		
		System.out.println("Tree set : "+tree_set);
		for(String  states : tree_set )
		{
			System.out.println(states);	
		}

	}

}
