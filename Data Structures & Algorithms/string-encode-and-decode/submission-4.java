class Solution {

     public String encode(List<String> strs) 
     {
        if (strs.isEmpty()) return "";
        StringBuilder output = new StringBuilder();
        for (String str : strs) {
            output.append(str.length()).append(',');
        } 
        output.append('#');
        for (String str : strs) {
            output.append(str);
        }
        System.out.println(output);
        return output.toString();
    }


    public List<String> decode(String str) {
        if(str.length() == 0)
          return new ArrayList<>();
        List<String> decodelist = new ArrayList<>();
        int d_index = str.indexOf('#');
        String str_size = str.substring(0, d_index);
        String[] strsizes = str_size.split(",");
        List<Integer> sizelist = new ArrayList<>();
        for(String size: strsizes){
            sizelist.add(Integer.parseInt(size));
        }
      
        // System.out.println(sizelist);
        String str_strings = str.substring(d_index+1, str.length());
          int i=0;
          for(Integer size: sizelist){
            int end = i+size;
                decodelist.add(str_strings.substring(i, end));
              i = end;
            
        }
        //System.out.println(str_size.toString()+" / "+ str_strings.toString());
        return decodelist;

    }
}
