package com.trl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FizzBuzzTest {

	@ParameterizedTest
	@MethodSource("provideResults")
	void runningSum(final int n , final List<String> results) {
		assertThat(FizzBuzz.fizzBuzz(n)).isEqualTo(results);
	}

	private static Stream<Arguments> provideResults() {
		return Stream.of(
//			Arguments.of(null, 0),
			Arguments.of(3, List.of("1", "2", "Fizz")),
			Arguments.of(5, List.of("1", "2", "Fizz", "4", "Buzz")),
			Arguments.of(15, List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"))
		);
	}
}
