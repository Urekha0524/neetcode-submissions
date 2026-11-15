class Solution {
    public boolean checkInclusion(String s1, String s2) {
      /*  if(s1.length() > s2.length()) return false;

        HashMap<Character, Integer> s1map = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i),0)+1);
        }

        for(int i=0; i<= (s2.length()-s1.length()); i++){
            HashMap<Character, Integer> s2map = new HashMap<>();
            for(int j=i; j< (i+s1.length()); j++){
                char c = s2.charAt(j);
                s2map.put(c, s2map.getOrDefault(c,0)+1);
            }
            if(s2map.equals(s1map))
               return true;
        }
         return false;*/

        int m = s1.length();
        int n = s2.length();

        if(m > n) return false;

        int[] s1arr = new int[26];
        int[] s2arr = new int[26];

        for(int i=0; i<m ; i++){
            s1arr[s1.charAt(i)-'a']++; 
            s2arr[s2.charAt(i)-'a']++; 
        }
        if(Arrays.equals(s1arr, s2arr)) return true;

        for(int i=m; i< n; i++){
            s2arr[s2.charAt(i-m)-'a']--;
            s2arr[s2.charAt(i)-'a']++;

            if(Arrays.equals(s1arr, s2arr)) return true;
            
        }

        return false;

}
}
