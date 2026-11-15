class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character,Integer> hashmap = new HashMap<>();

        int l=0; 
        int result=0;
        int maxFreq = 0;
        for(int r = 0; r<s.length(); r++){
            hashmap.put(s.charAt(r), hashmap.getOrDefault(s.charAt(r),0)+1);
            maxFreq = Math.max(maxFreq, hashmap.get(s.charAt(r)));

            while(((r-l+1) - maxFreq) > k){
                hashmap.put(s.charAt(l), hashmap.get(s.charAt(l))-1);
                l++;
            }
            result = Math.max(maxFreq, (r-l+1));

        }
       return result;
    }
}
