class Solution {

    public String encode(List<String> strs) {
        StringBuilder stbr = new StringBuilder();

        for(String str : strs){
            int len = str.length();
            stbr.append(len).append('#').append(str);
        }
        return stbr.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0, j=0;
        while(i<str.length()){
            j =i;
            while(str.charAt(j)!='#'){
               j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i = j+1;
            String word = str.substring(i, i+len);
            list.add(word);
            i = i+len;
        }
       return list;
    }
}
