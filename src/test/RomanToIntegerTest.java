package test;

import answer.RomanToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void romanToInt() {
        String s = "III";
        assertEquals(3, romanToInteger.romanToInt(s));
    }

    @Test
    void romanToInt2() {
        String s = "LVIII";
        assertEquals(58, romanToInteger.romanToInt(s));
    }

    @Test
    void romanToInt3() {
        String s = "MCMXCIV";
        assertEquals(1994, romanToInteger.romanToInt(s));
    }
}