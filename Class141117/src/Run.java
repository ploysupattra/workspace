import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Run {

	public static void main(String[] args) {
		try { ReadTestFile();} 
		catch (FileNotFoundException e) { System.out.println("File Not Found!!");}
		catch (IOException e2) { System.out.println("Can't Read File!!");}
		//Input Number
		try { String Userinput = JOptionPane.showInputDialog("Enter Number");
			 double input = Double.parseDouble(Userinput);
			 JOptionPane.showMessageDialog(null, input); } 
		catch (NumberFormatException exam) {JOptionPane.showMessageDialog(null, "Invalid Number Input!!"); }
	}
	public static void ReadTestFile() throws FileNotFoundException,IOException{
		//Call for File
		File Exam =new File("test.txt"); 
		try { FileReader FilRead = new FileReader(Exam);
			BufferedReader BufRead = new BufferedReader(FilRead);
			String line;
			while((line=BufRead.readLine()) !=null) { System.out.println(line); } } 
		//กรณีไม่โยน Error ออกไปให้ main  ทำ catch เอง
		/*catch (FileNotFoundException exam1) { System.out.println("File Not Found!!");}
		  catch (IOException exam2) { System.out.println("Can't Read File!!");}*/
		finally { System.out.println("Finally Block Away");}

	}

}
