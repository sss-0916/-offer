public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        
        int[] hashMap = new int[128];
        for (int i = 0; i < str.length(); ++i) {
            ++hashMap[str.charAt(i)];
        }
        
        for (int i = 0; i < str.length(); ++i) {
            if (hashMap[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}