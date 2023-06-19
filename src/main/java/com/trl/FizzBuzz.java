package com.trl;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

	// https://leetcode.com/explore/learn/card/the-leetcode-beginners-guide/692/challenge-problems/4424/

	public static List<String> fizzBuzz(int n) {
		String[] result = new String[n];

		for (int i = n; i > 0; i--) {
			if (isFizzBuzz(i)) {
				result[i - 1] = "FizzBuzz";
			} else if (isFizz(i)) {
				result[i - 1] = "Fizz";
			} else if (isBuzz(i)) {
				result[i - 1] = "Buzz";
			} else {
				result[i - 1] = i + "";
			}
		}

		return Arrays.asList(result);
	}

	private static boolean isFizzBuzz(final int n) {
		return (0 == (n % 3)) && (0 == (n % 5));
	}

	private static boolean isFizz(final int n) {
		return 0 == (n % 3);
	}

	private static boolean isBuzz(final int n) {
		return 0 == (n % 5);
	}
}
