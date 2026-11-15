class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;  i< temperatures.length; i++){
          int cur = temperatures[i];
         /*  while(!stack.isEmpty() && cur > stack.peek()[0]){
            int pair[] = stack.pop();
            result[pair[1]] = i - pair[1];
          }*/
          while(!stack.isEmpty() && cur > temperatures[stack.peek()])
          {
            int poppedIndex = stack.pop();
            result[poppedIndex] = i - poppedIndex;
          }
          stack.push(i);
        }
        return result;
    }
}
