class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int maxLength = 0;

        for(int r=0; r<s.length(); r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            maxLength = Math.max(maxLength, r-l+1);
        }
        return maxLength;
    }
}
