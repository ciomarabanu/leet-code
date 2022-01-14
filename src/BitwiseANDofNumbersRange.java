public class BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        var shiftCount = 0;
        while (left != right){
            shiftCount += 1;
            left = left / 2;
            right = right >> 1;
        }
        left = left << shiftCount;
        return left;
    }
}
