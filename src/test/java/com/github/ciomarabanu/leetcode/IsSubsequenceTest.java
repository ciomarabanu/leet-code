package com.github.ciomarabanu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

    @Test
    void test() {
        Assertions.assertEquals(false, IsSubsequence.isSubsequence("axc", "ahbgdc"));
        Assertions.assertEquals(true, IsSubsequence.isSubsequence("abc", "ahbgdc"));
    }

}
