package java8_Logic;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(22,444,22,444,24);
		List<Integer> removeDuplicate = list.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicate);
	}
}
