package test;

import answer.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSumTest1() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] answer = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, answer, "OK");
    }

    @Test
    void twoSumTest2() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] answer = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{1, 2}, answer, "OK");
    }

    @Test
    void twoSumTest3() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        int[] answer = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, answer, "OK");
    }

    @Test
    void twoSum2Test1() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] answer = twoSum.twoSum2(nums, target);
        assertArrayEquals(new int[]{0, 1}, answer, "OK");
    }

    @Test
    void twoSum2Test2() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] answer = twoSum.twoSum2(nums, target);
        assertArrayEquals(new int[]{1, 2}, answer, "OK");
    }

    @Test
    void twoSum2Test3() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        int[] answer = twoSum.twoSum2(nums, target);
        assertArrayEquals(new int[]{0, 1}, answer, "OK");
    }
}