
public class Randompass {


//Function : Random String
	// (no input) --> String
	static String myRandomStr()
	{
		String seed_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String random_str = "";
		for(int i=0; i<8; i++)
		{
			double rand = Math.random();
			double rand1 = rand*seed_chars.length();
			int selected_char = (int) rand1;
			char selected_character = seed_chars.charAt(selected_char);
			random_str = random_str + selected_character;// random_str += selected_character
		}
		
		return random_str;
	}
	public void showUserdetail() {System.out.println("username ="+""+ramdom_str);}
}