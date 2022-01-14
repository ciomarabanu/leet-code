import java.util.HashMap;

public class TwoSum {

    private int[] twoSum(int[] nums, int target) {
        var theBetterHalf = new HashMap<>();
        for (var i = 0; i < nums.length; i++) {
            if (!theBetterHalf.containsKey(target - nums[i])) {
                theBetterHalf.put(nums[i], i);
            } else {
                int[] result = new int[2];
                result[0] = i;
                result[1] = (int) theBetterHalf.get(target - nums[i]);
                return result;
            }
        }
        return new int[2];
    }
}
