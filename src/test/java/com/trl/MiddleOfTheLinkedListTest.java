package com.trl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MiddleOfTheLinkedListTest {

    @ParameterizedTest
    @MethodSource("provideResults")
    void numberOfSteps(final ListNode source, ListNode result) {
        assertThat(MiddleOfTheLinkedList.middleNode(source)).isEqualTo(result);
    }

    private static Stream<Arguments> provideResults() {
        final ListNode source1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        final ListNode result1 = new ListNode(3, new ListNode(4, new ListNode(5)));

        final ListNode source2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        final ListNode result2 = new ListNode(4, new ListNode(5, new ListNode(6)));

        return Stream.of(
                Arguments.of(source1, result1),
                Arguments.of(source2, result2)
        );
    }
}
