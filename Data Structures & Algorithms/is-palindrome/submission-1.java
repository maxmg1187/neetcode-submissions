class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        String pal = newStr.toString();
        int i = 0;
        int j = pal.length() - 1;
        while(i < j){
            if(pal.charAt(i) != pal.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
