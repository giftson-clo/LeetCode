class Solution {
    public int[] buildArray(int[] nums) {
        for(int i=0;i<nums.length;i++)
            nums[i] = (nums[nums[i]] % 1001) * 1001 + nums[i];
        for(int i=0;i<nums.length;i++)
            nums[i] /= 1001;
        return nums;
    }
}