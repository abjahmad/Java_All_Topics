package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String args[]) {
	ArrayList al = new ArrayList();
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println("after ---");
	al.add(10);
	al.add(11);
	al.add(10);
	al.add(11.1);
	al.add(00);
	al.add(2);
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println(al.contains(19));
	al.add(4,9);
	System.out.println(al);
	al.set(1, 3);
	System.out.println(al);
	
	ArrayList al1 = new ArrayList(al);
	al1.add(2);
	al1.add(11);
	al1.add(10);
	al1.add(11.1);
	al1.add(88);
	al1.add(44);
	System.out.println(al1);
	//al1.removeAll(al);
	System.out.println(al1);
	al1.retainAll(al);
	System.out.println(al1);
	
	}

}

