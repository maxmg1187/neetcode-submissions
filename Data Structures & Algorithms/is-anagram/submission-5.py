class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #do they contain the same characters
        #string is always at least 1 char
        #are both strings the same length? if not false
        #dictionary to keep track of character counts?
        if len(s) != len(t):
            return False
        s_seen = dict()
        t_seen = dict()
        for x in range(len(s)):
            s_seen[s[x]] = s_seen.get(s[x], 0) + 1
            t_seen[t[x]] = t_seen.get(t[x], 0) + 1
        return s_seen == t_seen