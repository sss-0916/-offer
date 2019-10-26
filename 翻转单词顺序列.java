public class Solution {
    public String ReverseSentence(String str) {
        char[] strArr = str.toCharArray();
        int left = 0, right = strArr.length - 1;
        
        reverse(strArr, left, right);
        
        while (left <= right) {
            int index = left;
            while (index <= right && strArr[index] != ' ') {
                ++index;
            }
            reverse(strArr, left, index - 1);
            left = index + 1;
        }
        
        return new String(strArr);
    }
    
    private void reverse(char[] str, int left, int right) {
        while (left <= right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            ++left;
            --right;
        }
    }
}