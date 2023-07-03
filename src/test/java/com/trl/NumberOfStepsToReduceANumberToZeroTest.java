package com.trl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfStepsToReduceANumberToZeroTest {

    @ParameterizedTest
    @MethodSource("provideResults")
    void numberOfSteps(final int number, final int numberOfSteps) {
        assertThat(NumberOfStepsToReduceANumberToZero.numberOfSteps(number)).isEqualTo(numberOfSteps);
    }

    private static Stream<Arguments> provideResults() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(14, 6),
                Arguments.of(8, 4),
                Arguments.of(123, 12)
        );
    }

}
