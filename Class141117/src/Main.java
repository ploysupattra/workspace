import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	 //ApplyDateString();
	 String DateIn = JOptionPane.showInputDialog("Enter Date");
	 Date ApplyD = ApplyDateString(DateIn);
	 System.out.println(ApplyD.toString());
	}
	public static Date ApplyDateString(String DateInput)  {
		DateFormat Dtest = new SimpleDateFormat("dd-MM-yyyy"); Date post;
		try {  post = Dtest.parse(DateInput);} 
		catch (ParseException date) { post=new Date();}
		return post;
	}

}
