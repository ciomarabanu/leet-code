package com.github.ciomarabanu.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MaximumLengthOfConcatenatedStringWithUniqueCharacter {
    public int maxLength(List<String> arr) {
        return dfs(arr, new HashSet<>(), 0);
    }

    private int dfs(List<String> arr, Set<Character> chars, int idx) {
        if (idx == arr.size()) {
            return chars.size();
        }

        boolean canAdd = true;
        for (int i = 0; i < arr.get(idx).length(); i++) {
            if (chars.contains(arr.get(idx).charAt(i))) {
                canAdd = false;
                break;
            }
        }
        Set<Character> idxChars = arr.get(idx).chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

        if (canAdd && idxChars.size() == arr.get(idx).length()) {
            var newChars = new HashSet<>(chars);
            newChars.addAll(idxChars);
            return Math.max(dfs(arr, newChars, idx + 1), dfs(arr, chars, idx + 1));
        } else {
            return dfs(arr, chars, idx + 1);
        }
    }
}
