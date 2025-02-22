class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] array = new int[length * 2];
        for(int i=0;i<nums.length;i++)
            array[i] = array[i+length] = nums[i];
        return array;
    }
}