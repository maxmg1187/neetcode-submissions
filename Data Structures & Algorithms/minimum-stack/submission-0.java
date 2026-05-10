class MinStack {

    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        //check if its empty before trying to compare val to the smallest number thus seen,
        //add if it doesnt one either of these.
        if(minStack.isEmpty() || val < minStack.get(minStack.size() - 1)){
            minStack.add(val);
        }
        //otherwise we know that the smallest value seen at this point is the previous value.
        else{
            minStack.add(minStack.get(minStack.size() - 1));
        }
    }

    
    public void pop() {
        stack.remove(stack.size() - 1);
        minStack.remove(minStack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        //secondary structure to store minimums, keep track of minimums removed and update accordingly.
        return minStack.get(minStack.size() - 1);
    }
}
