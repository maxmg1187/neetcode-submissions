class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int l = 0;
        HashSet<Character> dup = new HashSet();
        for(int r = 0; r < s.length(); r++){
            while(dup.contains(s.charAt(r))){
                dup.remove(s.charAt(l));
                l++;
            }
            dup.add(s.charAt(r));
            longest = Math.max(longest, r - l + 1);
        }
        return longest;
    }
}
