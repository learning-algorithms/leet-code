package com.trl;

public class MiddleOfTheLinkedList {

    // https://leetcode.com/problems/middle-of-the-linked-list/

    public static ListNode middleNode(final ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
    }
}
