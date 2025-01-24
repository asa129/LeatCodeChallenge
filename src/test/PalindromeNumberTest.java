package test;

import answer.PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        PalindromeNumber pn = new PalindromeNumber();
        pn.isPalindrome(121);
        assertTrue(pn.isPalindrome(121), "True OK");
        assertTrue(pn.isPalindrome(12121), "True OK");
        assertTrue(pn.isPalindrome(121212121), "True OK");
        assertFalse(pn.isPalindrome(-121), "False OK");
        assertFalse(pn.isPalindrome(10), "False OK");
    }
}