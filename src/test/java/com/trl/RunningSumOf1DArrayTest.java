package com.trl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RunningSumOf1DArrayTest {

	@ParameterizedTest
	@MethodSource("provideResults")
	void runningSum(final int[] numsInput, final int[] numsOutput) {
		assertThat(RunningSumOf1DArray.runningSum(numsInput)).hasSameSizeAs(numsOutput);
	}

	private static Stream<Arguments> provideResults() {
		return Stream.of(
			Arguments.of(null, new int[0]),
			Arguments.of(new int[0], new int[0]),
			Arguments.of(new int[]{1}, new int[]{1}),
			Arguments.of(new int[]{1,2,3,4}, new int[]{1,3,6,10}),
			Arguments.of(new int[]{1,1,1,1,1}, new int[]{1,2,3,4,5}),
			Arguments.of(new int[]{3,1,2,10,1}, new int[]{3,4,6,16,17})
		);
	}
}
