class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int temp;
        int k;
        while(i < j) {
            temp = nums[j];
            for(k=j;k>i;k--)
                nums[k] = nums[k-1];
            nums[i+1] = temp;
            i+=2;
            j++;
        }
        return nums;
    }
}