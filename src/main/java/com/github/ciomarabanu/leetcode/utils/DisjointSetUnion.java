package com.github.ciomarabanu.leetcode.utils;

import java.util.HashMap;
import java.util.Map;

public class DisjointSetUnion {
    private final Map<Integer, Integer> parent = new HashMap<>();
    private final Map<Integer, Integer> rank = new HashMap<>();

    public void initializeParent(int node) {
        parent.put(node, node);
        rank.put(node, 1);
    }

    public void union(int parent1, int parent2) {
        if (rank.get(parent1) <= rank.get(parent2)) {
            parent.put(parent1, parent2);
            rank.put(parent2, rank.get(parent1) + rank.get(parent2));
        } else {
            parent.put(parent2, parent1);
            rank.put(parent1, rank.get(parent1) + rank.get(parent2));
        }
    }

    public int find(int node) {
        if (node != parent.get(node))
            parent.put(node, find(parent.get(node)));
        return parent.get(node);
    }

}
