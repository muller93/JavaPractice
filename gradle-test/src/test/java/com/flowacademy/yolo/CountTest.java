package com.flowacademy.yolo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CountTest {
    Count count = new Count();

    @Test
    public void mySimpleEqualsTest(){
        String expectedName = "Lali";
        assertEquals(expectedName, "Lali");
    }
    @Test
    public void testSum(){ // teszt a nem egyenlőre
        assertNotEquals(count.sum(2, 2), 4);
    }
    @Test
    public void testDiv(){ // teszt az egyenlőre
        assertEquals(count.div(4, 1), 3);
    }
}
