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
			Arguments.of(new int[]{1,2,3,4}, new int[]{1,3,6,10})
		);
	}
}
