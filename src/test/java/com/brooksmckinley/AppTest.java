/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testExchangeReport() {
        // The example output on the canvas page is wrong, 81 * 1.3751 = 111.3831, which by the constraint to round up
        // to the next cent would be 111.39.
        String expected = "81.00 euros at an exchange rate of 1.375100 is\n" +
                "111.39 U.S. dollars.";
        String actual = App.getExchangeReport(81, 1.3751);
        Assertions.assertEquals(expected, actual);
    }
}