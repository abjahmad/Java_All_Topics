package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();

		long start = System.nanoTime();

		for (int i = 1; i <=100000; i++) {
			arrayList.add(i);
		}
		long end = System.nanoTime();

		System.out.println("ArrayList =" + (end - start));

		long start1 = System.nanoTime();
		for (int i = 1; i <=100000; i++) {
			linkedList.add(i);
		}
		long end1 = System.nanoTime();

		System.out.println("LinkedList =" + (end1 - start1));

		long start11 = System.nanoTime();

		for (int i = 1; i <100000; i++) {
			arrayList.get(i);
		}
		long end11 = System.nanoTime();

		System.out.println("ArrayList =" + (end11 - start11));

		long start22 = System.nanoTime();
		for (int i = 1; i <100000; i++) {
			linkedList.get(i);
		}
		long end22 = System.nanoTime();

		System.out.println("LinkedList =" + (end22 - start22));

	}
}
