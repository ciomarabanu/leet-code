import utils.DisjointSetUnion;

import java.util.*;
import java.util.Stack;

public class FindIfPathExistsInGraph {
    public boolean validPathBFS(int n, int[][] edges, int start, int end) {
//        mk ze fakin graph
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (var edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

//        do ze fakin dfs

        Set<Integer> visited = new HashSet<>();
        visited.add(start);
        Stack<Integer> toVisit = new Stack<>();
        toVisit.add(start);

        while (!toVisit.isEmpty()){
            var currNode = toVisit.pop();
            if (currNode == end)
                return true;
            for (var nei : graph.get(currNode)){
                if (!visited.contains(nei)){
                    toVisit.push(nei);
                    visited.add(nei);
                }
            }
        }
        return false;
    }

    public boolean validPathUnionFind (int n, int[][] edges, int start, int end) {
        var dsu = new DisjointSetUnion();
        for (int i = 0; i < n; i++){
            dsu.initializeParent(i);
        }
        for (var edge : edges){
            var parent1 = dsu.find(edge[0]);
            var parent2 = dsu.find(edge[1]);
            if (parent1 != parent2){
                dsu.union(parent1, parent2);
            }
        }
        return dsu.find(start) == dsu.find(end);
    }
}



