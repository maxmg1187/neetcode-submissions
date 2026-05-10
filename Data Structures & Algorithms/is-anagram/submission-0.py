class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dic = {}
        for char in s:
            if char not in dic:
                dic[char] = 1
            else:
                dic[char] += 1
        for char in t:
            if char not in dic:
                return False
            else:
                dic[char] -= 1
        for key in dic:
            if dic[key] > 0:
                return False
        return True