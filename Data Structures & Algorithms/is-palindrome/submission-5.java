class Solution {
    public boolean isPalindrome(String s) {
     s = s.replaceAll("\\s+","").toLowerCase();
     int left=0, right =s.length()-1;
     while(left<right){
        while(left < right && !isAlphaNum(s.charAt(left))) left++;
        while(right > left &&!isAlphaNum(s.charAt(right))) {
            right--;
            }
        if((s.charAt(left)!=s.charAt(right))){
            return false;
        } 
        else {
             left++; 
             right--;
        }      
     }
     return true;
    }
    public boolean isAlphaNum(char ch){
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&& ch <='9')) return true;
        return false;
    }
}

