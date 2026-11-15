class Solution {
    public int evalRPN(String[] tokens) {

      Stack<Integer> stack = new Stack<>();
      for(String ch : tokens){
        if(ch.equals("+" )|| ch.equals("-") ||ch.equals("*") || ch.equals("/"))
        {
            if(!stack.isEmpty()){
                Integer op2 = stack.pop();
                Integer op1 = stack.pop();
                int result=0;
                switch(ch){
                    case "+" : result = op1 + op2; break;
                    case "-" : result = op1 - op2; break;
                    case "*" : result = op1 * op2; break;
                    case "/" : result = op1 / op2; break;
                }
                stack.push(result);
            }
        }
        else 
         stack.push(Integer.parseInt(ch));
      }
      return stack.peek();
    }
}
