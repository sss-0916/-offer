public class Solution {
    public int Add(int num1,int num2) {
        while (num2 != 0) {
            int temp = num1 & num2;
            num1 = num1 ^ num2;
            num2 = temp << 1;
        }
        
        return num1;
    }
}