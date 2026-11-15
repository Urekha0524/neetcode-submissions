class Solution {
    private boolean matches(int[] freq1, int[] freq2){
        for(int i=0; i< 26; i++){
           if(freq1[i] != freq2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int s1freq[] = new int[26];
        int s2freq[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            s1freq[s1.charAt(i) - 'a']++;
            s2freq[s2.charAt(i) - 'a']++;
        }
        
        if(matches(s1freq, s2freq)) return true;

        int windowSize = s1.length();

        for(int i= windowSize; i< s2.length(); i++){
            s2freq[s2.charAt(i)-'a']++;
            s2freq[s2.charAt(i - windowSize)-'a']--;
             
            System.out.println(s2.charAt(windowSize));
            if(matches(s1freq, s2freq)) return true;
        }
        return false;
    }
}
