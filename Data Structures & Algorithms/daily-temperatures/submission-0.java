class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int index[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int previousIndex = stack.pop();
                index[previousIndex] = i-previousIndex;
            }
            stack.push(i);
        }
      return index;
        
    }
}
