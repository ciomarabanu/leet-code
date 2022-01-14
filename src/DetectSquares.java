import java.util.*;

public class DetectSquares {

    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 10};
        int[] arr2 = new int[]{11, 2};
        int[] arr3 = new int[]{3, 2};
        DetectSquares problem = new DetectSquares();
        problem.add(arr1);
        problem.add(arr2);
        problem.add(arr3);
        System.out.println(problem.count(new int[]{11, 10}));
        System.out.println(problem.count(new int[]{14, 8}));
        problem.add(new int[]{11, 2});
        System.out.println(problem.count(new int[]{11, 10}));
    }

    Map<String, Integer> pointsCount;
    List<int[]> points;

    public DetectSquares() {
        pointsCount = new HashMap<>();
        points = new ArrayList<>();
    }

    public void add(int[] point) {
        var pointKey = point[0] + "#" + point[1];
        pointsCount.put(pointKey, pointsCount.getOrDefault(pointKey, 0) + 1);
        points.add(point);
    }

    public int count(int[] p1) {
        int counter = 0;
        for (int[] p3 : points) {
            if (p3[0] != p1[0] && Math.abs(p3[0] - p1[0]) == Math.abs(p3[1] - p1[1])) {

                var p2Key =  p3[0] + "#" + p1[1];
                var p4Key =  p1[0] + "#" + p3[1];

                counter += pointsCount.getOrDefault(p2Key, 0) *
                        pointsCount.getOrDefault(p4Key, 0);
            }
        }
        return counter;
    }
}
