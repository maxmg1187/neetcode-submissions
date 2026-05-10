class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int [] ans = new int[2];
        for(int i = 0; i < nums.length; i ++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                ans[1] = i;
                ans[0] = map.get(complement);
            }
            else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
