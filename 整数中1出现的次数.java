public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= n; ++i) {
            str.append(i);
        }
        
        int times = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '1') {
                ++times;
            }
        }
        return times;
    }
}