class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ops = new Stack<>();
        int x = 0;
        int y = 0;
        int res = 0;
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                x = ops.pop();
                y = ops.pop();
                res = x + y;
                ops.push(res);
            }
            else if(tokens[i].equals("-")){
                x = ops.pop();
                y = ops.pop();
                res = y - x;
                ops.push(res);
            }
            else if(tokens[i].equals("*")){
                x = ops.pop();
                y = ops.pop();
                res = x * y;
                ops.push(res);
            }
            else if(tokens[i].equals("/")){
                x = ops.pop();
                y = ops.pop();
                res = y / x;
                ops.push(res);
            }
            else{
                ops.push(Integer.parseInt(tokens[i]));
            }
        }
        return ops.peek();
    }
}
