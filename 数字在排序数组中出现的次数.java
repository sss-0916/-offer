public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; ++i) {
            str.append(array[i]);
        }
        
        int left = str.indexOf(String.valueOf(k));
        if (left == -1) {
            return 0;
        }
        int right = str.lastIndexOf(String.valueOf(k));
        return right - left + 1;
    }
}