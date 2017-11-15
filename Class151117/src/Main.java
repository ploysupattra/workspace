import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Collection<String> p; //�� Interface,no Object
		List<String> n; //�� Interface,no Object
		ArrayList<String> Mylist; //�� Class ,Implement List Interface
		Mylist = new ArrayList<>(); //Mylist �� ArraryList,�Ѻ Method ArrayList 
		n = new ArrayList<>(); p = new ArrayList<>(2);
		//for(String i:p) { System.out.println(i);}
		Set<String> Myset = new HashSet<>();
		Set<String> Meset = new TreeSet<>();
		String[] initData = { "Monday","Tuseday","Friday"};
		for(int i=0;i<initData.length;i++) { Myset.add(initData[i]); Meset.add(initData[i]); }
		//System.out.println("Hash Set :"+Myset.toString());
		//System.out.println("Tree Set :"+Meset.toString());
		Myset.addAll(Meset);
		for(Iterator<String> iter = Meset.iterator(); iter.hasNext();) { 
			String member = (String)iter.next();
			System.out.println(member);}
		List<String> list1 = new ArrayList<>(); List<String> list2 = new LinkedList<>();
		list1 = new ArrayList<>(Arrays.asList(initData)); 
		list1.add("Sunday");
		System.out.println(list1.toString());
		// ��õ�Ǩ�ͺẺ boolean 
		String mem = list1.get(2);
		System.out.println(mem);
		System.out.println("Has Monday :"+list1.contains("Monday"));
		//����� sublist
		list2 = list1.subList(1, 3);
		//System.out.println(list2.toString());
		ListIterator<String> it = list1.listIterator(list1.size());
		while (it.hasPrevious()) { System.out.println("List :"+it.previous());}
		
		//Map
		Map<Integer, Product> Promap = new HashMap<>();
		Promap.put(new Integer(1), new Product(1, "HJ2F", "test1", 250));
		Promap.put(new Integer(2), new Product(2, "NJ54", "test2", 330));
		//Promap.put(2,"ggg","City map",250);
		//Promap.put("P3dbu", "Indu Masch1ine");
		System.out.println("num : "+Promap.size());
		System.out.println(Promap.get("P2DO"));
	}
	
	static  class Product {
		int ItemID;
		String ProCode;
		String ProName;
		double price;
		public  Product(int ItemID,String ProCode,String ProName,double price) {
			this.ItemID=ItemID; this.ProCode=ProCode; this.ProName=ProName; this.price=price;
		}
	}


}
