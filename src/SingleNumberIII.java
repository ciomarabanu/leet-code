import java.util.Arrays;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        var targetsXor = Arrays.stream(nums).reduce(0, (acc, n) -> acc ^ n);
        var xorLeastSignificantBit = targetsXor & -targetsXor;

        var firstNum = Arrays.stream(nums)
                .reduce(0, (acc, n) -> (xorLeastSignificantBit & n) == 0 ? acc ^ n : acc);
        var secNum = Arrays.stream(nums)
                .reduce(0, (acc, n) -> (xorLeastSignificantBit & n) != 0 ? acc ^ n : acc);
        return new int[]{firstNum, secNum};
    }
}
