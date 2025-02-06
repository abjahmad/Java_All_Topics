package java8_Logic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(2, 34, 55, 232, 2, 1);
		/*
		 * reduce() method ek terminal operation hai, jo ek stream ke elements ko ek
		 * single result me combine karne ke liye use hota hai. Ye method aggregation
		 * operations jaise sum, average, min, max, concatenation, etc., perform karne
		 * me madad karta hai.
		 */
		Optional<Integer> sumOfAll = list.stream().reduce((a, b) -> a + b);
		System.out.println(sumOfAll.get());
	}
}
