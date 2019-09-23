import java.util.Stack;

public class Solution {
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();
    
    public void push(int node) {
        stack.push(node);
        
        if(minStack.empty()){
            minStack.push(node);
        }else{
            minStack.push(minStack.peek() < node ? minStack.peek() : node);
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}