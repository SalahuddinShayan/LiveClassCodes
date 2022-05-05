package LiveClassCodes;
import java.util.*;

public class CollectionAssisted {
	public static void main(String[] args) {
		System.out.println("Array list mixed data");
		ArrayList Al = new ArrayList();
		Al.add(10);
		Al.add("Sachin");
		Al.add('s');
		Al.add(1909.87f);
		Al.add(123456.789);		
		
		
		System.out.println(Al);
		System.out.println("ArrayList for specific data");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Banglore");
		city.add("Delhi");
		System.out.println(city);
		
		System.out.println("Vector");
		Vector vec = new Vector();
		vec.addElement(10);
		vec.addElement(15);
		System.out.println(vec);
		
		System.out.println("\r\n");
		System.out.println("LinkedList");
		LinkedList<String> names =new LinkedList<String>();
		names.add("Alex");
		names.add("Jhon");
		System.out.println(names);
		
		Iterator<String> itr= names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
			
			System.out.println("\r\n");
			System.out.println("HashSet");
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(100);
			set.add(50);
			set.add(750);
			set.add(200);
			set.add(15);
			System.out.println(set);
			
			
			System.out.println("\r\n");
			System.out.println("LinkedHashSet");
			LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
			set2.add(100);
			set2.add(50);
			set2.add(750);
			set2.add(200);
			set2.add(15);
			System.out.println(set2);
			
			
		}
	}

}
