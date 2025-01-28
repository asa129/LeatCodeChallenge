package test;

import answer.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix1() {
        String[] strs = {"flower","flow","flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs));
    }
}