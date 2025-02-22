class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] array = new int[length * 2];
        System.arraycopy(nums, 0, array, 0, length);
        System.arraycopy(nums, 0, array, length, length);
        return array;
    }
}