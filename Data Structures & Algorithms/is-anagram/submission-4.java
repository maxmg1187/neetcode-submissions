class Solution {
    public boolean isAnagram(String s, String t) {
        /*how to check that both strings have the same letters and amount of them?
        lets use hashmap to store frequencies from s and compare to t, if empty at end we 
        can return answer*/

        //case where strings are not equal length = immediate no
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            if(freq.containsKey(t.charAt(i))){
                if(freq.get(t.charAt(i)) == 1){
                    freq.remove(t.charAt(i));
                }
                else{
                    freq.put(t.charAt(i), freq.get(t.charAt(i)) - 1);
                }
            }
        }
        return freq.isEmpty();
    }
}
