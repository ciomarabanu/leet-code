package com.github.ciomarabanu.leetcode;

import java.util.*;

public class OpenTheLock {

    public static void main(String[] args) {
        System.out.println(neighbours("0000"));
    }

    private static List<String> neighbours(String root) {
        var result = new ArrayList<String>();
        for (int i = 0; i <= 3; i++) {
            int prevDigit = root.charAt(i) - '0';
            String suffix = root.substring(i + 1);
            String prefix = root.substring(0, i);
            result.add(prefix + Math.floorMod(prevDigit + 1, 10) + suffix);
            result.add(prefix + Math.floorMod(prevDigit - 1, 10) + suffix);
        }
        return result;
    }

    public int openLock(String[] deadends, String target) {
        var visited = new HashSet<>(Arrays.asList(deadends));
        String initialLock = "0000";
        if (visited.contains(target) || visited.contains(initialLock))
            return -1;

        Queue<Combination> toVisit = new LinkedList<>(Collections
                .singletonList(new Combination(initialLock, 0)));
        visited.add(initialLock);

        while (!toVisit.isEmpty()) {
            var currCombo = toVisit.poll();
            if (currCombo.digits.equals(target))
                return currCombo.steps;

            for (var nextCombo : neighbours(currCombo.digits)) {
                if (!visited.contains(nextCombo)) {
                    toVisit.offer(new Combination(nextCombo, currCombo.steps + 1));
                    visited.add(nextCombo);
                }
            }
        }

        return -1;
    }

    class Combination {
        String digits;
        int steps;

        public Combination(String digits, int steps) {
            this.digits = digits;
            this.steps = steps;
        }
    }
}
