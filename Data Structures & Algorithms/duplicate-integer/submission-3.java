class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*if we use a hashmap we can lookup values
        ,if they dont exist lets put them in there.
        if they already exist, immediately return true.*/
        HashMap<Integer, Integer> seen = new HashMap<>();

        //for loop will check each number in nums
        for(int i  = 0; i < nums.length; i++){
            if(seen.containsKey(nums[i])){
                return true;
            }
            else{
                seen.put(nums[i], 1);
            }
        }
        return false;
    }
}