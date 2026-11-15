class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToopen = new HashMap<>();
        closeToopen.put(')','(');
        closeToopen.put(']','[');
        closeToopen.put('}','{');

        for(char c: s.toCharArray()){
            if(closeToopen.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == closeToopen.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
   
}
