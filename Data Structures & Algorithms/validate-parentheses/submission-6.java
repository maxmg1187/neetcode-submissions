class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!chars.isEmpty() && chars.peek() == map.get(c)){
                    chars.pop();
                }
                else{
                    return false;
                }
            }
            else{
                chars.push(c);
            }
        }
        return chars.isEmpty();
    }
}
