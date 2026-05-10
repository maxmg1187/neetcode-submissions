class Solution {
    public int[] twoSum(int[] nums, int target) {
        //hashmap to store previously seen values and find if the complement of that number that sums 
        //to the target is present, if it is return those indices.
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(seen.containsKey(complement)){
                return new int[] {seen.get(complement), i};
            }
            else{
                seen.put(nums[i], i);
            }
            //target = 7 3,3,4,5
        }
        return new int[2];
    }
}
