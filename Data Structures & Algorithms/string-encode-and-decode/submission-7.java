class Solution {

    public String encode(List<String> strs) {
        StringBuilder stb = new StringBuilder();
        for(String str : strs){
            int len = str.length();
            stb.append(len).append('#');
            stb.append(str);
        }
       // System.out.println(new String(stb));
        return new String(stb);
    }

    public List<String> decode(String str) {
        List<String> str_list = new ArrayList<>();
          int i=0;
          while(i< str.length()){
            int j =i;
              while(str.charAt(j)!='#'){
                j++;
              }
            int l = Integer.parseInt(str.substring(i,j));
           int k = j+l+1;
            j = j+1;
            String s = str.substring(j, k);
            str_list.add(s);
            i = k;
          }
        return str_list;
    }
}
