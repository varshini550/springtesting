package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class controllerTest {

    @Test
    void test() {
        controller c = new controller();
        int result = c.addCSE(2, 3);
        assertEquals(5, result);
    }

}