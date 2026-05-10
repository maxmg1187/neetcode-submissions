class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        frequencies = {}
        for num in nums:
            if num not in frequencies:
                frequencies[num] = 1
            else:
                frequencies[num] += 1
        
        for key in frequencies:
            if frequencies[key] > 1:
                return True
        return False