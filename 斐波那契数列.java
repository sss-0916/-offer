public class Solution {
    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        
        if(n == 1 || n == 2){
            return 1;
        }
        
        int result = 0;
        int n1 = 1;
        int n2 = 1;
        for(int i = 3; i <= n; ++i){
            result = n1 + n2;
            n2 = n1;
            n1 = result;
        }
        
        return result;
    }
}