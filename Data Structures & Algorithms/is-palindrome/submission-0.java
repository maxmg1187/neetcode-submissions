class Solution {
    public boolean isPalindrome(String s) {
        String trimmed = s.replaceAll("[\\s\\p{P}]+", "");
        trimmed = trimmed.toLowerCase();
        int left = 0;
        int right = trimmed.length() - 1;
        System.out.println(trimmed);
        while(left <= right){
            if(trimmed.charAt(left) != trimmed.charAt(right)){
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}
