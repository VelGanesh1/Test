package Day16and17.Control.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class List1 {
	public static void main(String[]args) {
		List<String> a = new ArrayList<String>();
		a.add("Sanakr");
		a.add("Vel");
		a.add("Ganesh");
		List<String> z = new ArrayList<String>();
		z.add("Mani");
		z.add("Murugan");
		z.add("Karthi");
		z.add("Karthi");
		z.add("Raghu");
		System.out.println(a);
		List<String> y=new LinkedList<String>();
		y.addAll(a);
		y.add("Hello");
		System.out.println(y);
		int b=a.size();
		System.out.println(b);
		String c=a.get(1);
		System.out.println(c);
		a.add(1, "Venkat");
		System.out.println(a);
		a.addAll(2, z);
		System.out.println(a);
		a.sort(null);
		System.out.println(a);
		a.clear();
		System.out.println(a);
		a.size();
		System.out.println(a);
		a.add(0, "Hi");
		System.out.println(a);
		a.addAll(z); 
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.set(2, "Muthiah");
		System.out.println(a);
	}

}
