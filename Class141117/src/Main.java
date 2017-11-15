import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	 //ApplyDateString();
		List<Date> MyDate = new ArrayList<Date>();
	 for(int i=0;i<3;i++) {
		 String DateIn = JOptionPane.showInputDialog("Enter Date");
		 Date ApplyD = ApplyDateString(DateIn);
		 MyDate.add(ApplyD);
		 //System.out.println(ApplyD.toString());
	 }
	 
	 System.out.println(MyDate.toString());
	 
	 
	}
	public static Date ApplyDateString(String DateInput)  {
		DateFormat Dtest = new SimpleDateFormat("dd-MM-yyyy"); Date post;
		try {  post = Dtest.parse(DateInput);} 
		catch (ParseException date) { post=new Date();}
		return post;
	}

}
