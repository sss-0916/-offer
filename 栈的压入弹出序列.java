import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length != popA.length){
            return false;
        }
        
        Stack<Integer> s = new Stack<Integer>();
        int j = 0;
        for(int i = 0; i < pushA.length; ++i){
            s.push(pushA[i]);
            
            while(!s.empty() && s.peek() == popA[j]){
                s.pop();
                ++j;
            }
        }
        
        return s.empty();
    }
}