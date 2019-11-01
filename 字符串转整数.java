public class Solution {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        
        int sum = 0;
        boolean isPositiveNumber = true;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '+') {
                continue;
            }
            if (str.charAt(i) == '-') {
                isPositiveNumber = false;
                continue;
            }
            
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum = sum * 10 + str.charAt(i) - '0';
            } else {
                return 0;
            }
        }
        
        if (!isPositiveNumber) {
            return -sum;
        }
        return sum;
    }
}