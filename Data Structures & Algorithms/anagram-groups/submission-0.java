class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s_new = new String(ch);
            if(!map.containsKey(s_new)){
                map.put(s_new, new ArrayList<>());
            }
            map.get(s_new).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
