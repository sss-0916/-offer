public class Solution {
    public double Power(double base, int exponent) {
        if(base == 0){
            return 0;
        }
        
        if(exponent == 0 || base == 1){
            return 1;
        }
        
        int temp = Math.abs(exponent);
        int mul = 1;
        while(temp != 0){
            mul *= base;
            --temp;
        }
        
        if(exponent < 0){
            return 1.0 / mul;
        }
        
        return mul;
    }
}