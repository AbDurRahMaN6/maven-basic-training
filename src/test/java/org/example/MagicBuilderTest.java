package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicBuilderTest {

    @Test
    public void testLucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }
}