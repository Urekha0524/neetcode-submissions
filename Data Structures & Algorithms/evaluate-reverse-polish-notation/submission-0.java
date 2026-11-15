class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
       for(String token : tokens){
          if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
            int op2 = stack.pop();
            int op1 = stack.pop();
            int result =0;

            switch(token){
                case "+": result = op1 + op2; break;
                case "-": result = op1 - op2; break;
                case "*": result = op1 * op2; break;
                case "/": result = op1 / op2; break;
            }
            stack.push(result);
          }
          else {
            stack.push(Integer.parseInt(token));
          }
       }
      return stack.pop();
    }
}
