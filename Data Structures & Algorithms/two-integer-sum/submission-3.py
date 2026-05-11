class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for x in range(len(nums)):
            complement = target - nums[x]
            if complement in seen:
                return [seen[complement], x]
            seen[nums[x]] = x