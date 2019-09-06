import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        if(stack2.empty()){
            while(!stack1.empty()){
                int temp = stack1.pop();
                stack2.push(temp);
            }
        }
        
        return stack2.pop();
    }
}