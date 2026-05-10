class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dic = {}
        "store first string 's' in a dictionary"
        for char in s:
            if char not in dic:
                dic[char] = 1
            else:
                dic[char] += 1

        "remove characters from string 't' from our dictionary"
        for char in t:
            if char not in dic:
                return False
            else:
                dic[char] -= 1
        
        "if dictionary is empty, they're anagrams"
        for key in dic:
            if dic[key] > 0:
                return False
        return True
