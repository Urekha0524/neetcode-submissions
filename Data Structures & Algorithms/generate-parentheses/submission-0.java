class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String current ="";
        backtrack(0, 0, n, current,result); 
        return result;
    }
    private void backtrack(int open, int close, int max, String current, List<String> result){
        if(open == close && open == max){
            result.add(current);
            return;
        }
        if(open<max){
            backtrack(open+1, close, max, current+"(",result);
        }
        if(close<open){
            backtrack(open, close+1, max, current+")",result);
        }

    }
}
