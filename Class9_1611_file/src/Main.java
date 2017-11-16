import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File InputFile = new File("input.txt");
		try { FileReader fReader = new FileReader(InputFile);
			  BufferedReader BufRead = new BufferedReader(fReader);
			  String line;
			  while ((line=BufRead.readLine())!=null) {
				System.out.println("line : "+ line);	
			  } BufRead.close();
			  File fOutput = new File("output.txt");
			  FileWriter fWriter =new FileWriter(fOutput);
			  BufferedWriter BufWriter = new BufferedWriter(fWriter);
			  BufWriter.write("Hello");
			  BufWriter.newLine();
			  BufWriter.write("This is a test");
			  BufWriter.close();
			} 
		catch (FileNotFoundException e) { System.out.println("Not Found"); e.printStackTrace();} 
		catch (IOException e) {System.out.println("Can't Read Line!!");}
		
	}

}
