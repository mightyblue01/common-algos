package com.basant.algorithmsworkbook.datastructures.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringInPlaceTest {
/*
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
*/
    @Test
    public void testReverseArrayInPlace() {
        System.out.println("Inside testReverseArrayInPlace()");
        char[] inputArr={'h','e','l','l','o'};
        char[] resultArr={'o','l','l','e','h'};
        ReverseStringInPlace rv = new ReverseStringInPlace();

        assertArrayEquals(resultArr,rv.reverseString(inputArr));
    }

}