public class RemoveElement {
    public static void main(String[] args) {
        int[] test = new int[]{0, 1, 2, 2, 3, 4, 4, 4, 4, 5};
        int[] test1 = new int[]{3,2,2,3};

        System.out.println(removeElement(test, 4));
        System.out.println(removeElement(test1, 3));
    }
    public static int removeElement(int[] nums, int val) {
        int valCounter = 0;
        for (int i = nums.length-1; i >= 0; i--){
            if (nums[i] == val){
                valCounter += 1;
                nums[i] = nums[nums.length - valCounter];
            }
        }

        return nums.length - valCounter -1;
    }
}
