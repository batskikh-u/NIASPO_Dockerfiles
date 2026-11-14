package ru.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    @Test
    void sumWorks() {
        assertEquals(5, Hello.sum(2, 3));
    }
}
