package ru.eexxyyq.solutions.tasks.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void isValidSequence() {
        assertFalse(Task6.isValidSequence(""));
        assertFalse(Task6.isValidSequence(null));
        assertFalse(Task6.isValidSequence("     "));
        assertFalse(Task6.isValidSequence("()[)]"));
        assertFalse(Task6.isValidSequence("[)()]"));
        assertFalse(Task6.isValidSequence("[(()()]"));
        assertTrue(Task6.isValidSequence("()[]"));
        assertTrue(Task6.isValidSequence("(([]))"));
        assertTrue(Task6.isValidSequence("([])([])([])([])"));
        assertFalse(Task6.isValidSequence("(([)])"));
        assertFalse(Task6.isValidSequence("(([])]"));
        assertFalse(Task6.isValidSequence("([[])]"));
        assertFalse(Task6.isValidSequence("]"));
    }

    @Test
    void isValidSequenceWithoutType() {
        assertFalse(Task6.isValidSequenceWithoutTypes(""));
        assertFalse(Task6.isValidSequenceWithoutTypes(null));
        assertFalse(Task6.isValidSequenceWithoutTypes("     "));
        assertFalse(Task6.isValidSequenceWithoutTypes("()[)]"));
        assertFalse(Task6.isValidSequenceWithoutTypes("[)()]"));
        assertFalse(Task6.isValidSequenceWithoutTypes("[(()()]"));
        assertTrue(Task6.isValidSequenceWithoutTypes("()[]"));
        assertTrue(Task6.isValidSequenceWithoutTypes("(([]))"));
        assertTrue(Task6.isValidSequenceWithoutTypes("([])([])([])([])"));
        assertTrue(Task6.isValidSequenceWithoutTypes("(([)])"));
        assertTrue(Task6.isValidSequenceWithoutTypes("(([])]"));
        assertTrue(Task6.isValidSequenceWithoutTypes("([[])]"));
    }
}