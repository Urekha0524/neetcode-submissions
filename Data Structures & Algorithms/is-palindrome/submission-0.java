class Solution {
    public boolean isPalindrome(String s) {
        //StringBuilder stb = new StringBuilder(s);
        s = s.replaceAll("[^A-Za-z0-9]","");
        s = new StringBuilder(s).toString().toLowerCase();
        String s_reverse = new StringBuilder(s).reverse().toString();
        if(s.equals(s_reverse))
          return true;
        return false;

    }
}
