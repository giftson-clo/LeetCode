class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums)
            map.put(n, map.getOrDefault(n, 0)+1);
        for(int k : map.keySet()) {
            int key = map.get(k);
            goodPairs += key * (key-1) / 2;
        }
        return goodPairs;
    }
}