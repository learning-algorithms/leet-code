package com.trl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RansomNoteTest {

    @ParameterizedTest
    @MethodSource("provideResults")
    void numberOfSteps(final String ransomNote, final String magazine, final boolean result) {
        assertThat(RansomNote.canConstruct(ransomNote, magazine)).isEqualTo(result);
    }

    private static Stream<Arguments> provideResults() {
        return Stream.of(
                Arguments.of("a", "b", false),
                Arguments.of("aa", "ab", false),
                Arguments.of("aa", "aab", true),
                Arguments.of("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj", true),
                Arguments.of("fihjjjjei", "hjibagacbhadfaefdjaeaebgi", false)
        );
    }
}
