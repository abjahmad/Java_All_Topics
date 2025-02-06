package java8_Logic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateUsingJava8 {
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1, 23, 455, 22, 23, 1, 44, 55, 44, 22);
		Set<Integer> set = new  HashSet<Integer>();
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
	}

}
