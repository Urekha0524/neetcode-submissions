class Solution {

    public String encode(List<String> strs) {
       StringBuilder stb = new StringBuilder(); 
       for(String str : strs){
        stb.append(str.length()).append("#").append(str);
       }
       return new String(stb);
    }

    public List<String> decode(String str) {
       int i =0;
       List<String> result = new ArrayList<>();
       while(i<str.length()){
        int j=i;
          while(str.charAt(j)!='#'){
            j++;
          }
          int len = Integer.parseInt(str.substring(i,j));

          result.add(str.substring(j+1, j+len+1));
          i = j+1+len;
       }
       return result;
    }
}
