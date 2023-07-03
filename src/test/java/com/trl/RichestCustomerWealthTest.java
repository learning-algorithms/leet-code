package com.trl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RichestCustomerWealthTest {

	@ParameterizedTest
	@MethodSource("provideResults")
	void maximumWealth(final int[][] accounts, final int wealth) {
		assertThat(RichestCustomerWealth.maximumWealth(accounts)).isEqualTo(wealth);
	}

	private static Stream<Arguments> provideResults() {
		int firstArray[][] = {{1, 2, 3}, {3, 2, 1}};
		int secondArray[][] = {{1, 5}, {7, 3}, {3, 5}};
		int thirdArray[][] = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

		return Stream.of(
//			Arguments.of(null, 0),
			Arguments.of(new int[0][0], 0),
			Arguments.of(firstArray, 6),
			Arguments.of(secondArray, 10),
			Arguments.of(thirdArray, 17)
		);
	}
}
