package com.github.ciomarabanu.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelCoursesIII {
    Map<Integer, Integer> savedCoursesDuration = new HashMap<>();

    public int minimumTime(int n, int[][] relations, int[] time) {
        var adjList = Arrays.stream(relations).collect(
                Collectors.groupingBy(r -> r[1],
                        Collectors.mapping(r -> r[0],
                                Collectors.toList()))
        );

        return IntStream.range(1, n + 1)
                .map(courseID -> courseDuration(courseID, adjList, time))
                .max().orElse(0);
    }

    private int courseDuration(int course, Map<Integer, List<Integer>> graph, int[] time) {
        return savedCoursesDuration.computeIfAbsent(course, c ->
                time[c - 1] + graph.getOrDefault(c, new ArrayList<>()).stream()
                        .map(dep -> courseDuration(dep, graph, time))
                        .max(Comparator.naturalOrder()).orElse(0));
    }

}
