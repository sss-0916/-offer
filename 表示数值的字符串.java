public class Solution {
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }
        
        boolean hasE = false, decimal = false, sign = false;
        for (int i = 0; i < str.length; ++i) {
            char ch = str[i];
            if (ch == 'e' || ch == 'E') {
                if (hasE) {
                    return false;
                }
                if (i == str.length - 1) {
                    return false;
                }
                hasE = true;
            } else if (ch == '+' || ch == '-') {
                if (sign && str[i - 1] != 'e' && str[i - 1] != 'E') {
                    return false;
                }
                if (!sign && i > 0 && str[i - 1] != 'e' && str[i - 1] != 'E') {
                    return false;
                }
                sign = true;
            } else if (ch == '.') {
                if (hasE || decimal) {
                    return false;
                }
                decimal = true;
            } else if (ch < '0' || ch > '9') {
                return false;
            }
        }
        
        return true;
    }
}