public class MinValGetPositiveStepByStepSum {
    public static void main(String[] args) {
        System.out.println(minStartValue(new int[] {1,2}));
    }
    public static int minStartValue(int[] nums) {
        int startValue = 1;
        int currSum = 0;
        for (int num : nums) {
            currSum += num;
            if (currSum + startValue < 1) {
                startValue = Math.max(1 - currSum, 1);
            }
        }
        return startValue;
    }
}
