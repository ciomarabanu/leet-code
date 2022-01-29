package com.github.ciomarabanu.leetcode;

import java.util.*;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visitedOrWillVisit = new HashSet<>();
        visitedOrWillVisit.add(0);
        Queue<Integer> toVisit = new LinkedList<>(Collections.singletonList(0));

        while (!toVisit.isEmpty()){
            var currRoom = toVisit.poll();
            for (var key : rooms.get(currRoom)){
                if (!visitedOrWillVisit.contains(key)){
                    toVisit.offer(key);
                    visitedOrWillVisit.add(key);
                }
            }
        }
        return (visitedOrWillVisit.size() == rooms.size());
    }
}
