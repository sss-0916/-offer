import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if (num == null || num.length < 1 || num.length < size || size < 1) {
            return result;
        }
        
        int length = num.length;
        for (int i = 0; i < length - size + 1; ++i) {
            int temp = Integer.MIN_VALUE;
            for (int j = 0; j < size; ++j) {
                if (num[j + i] > temp) {
                    temp = num[j + i];
                }
            }
            result.add(temp);
        }
        
        return result;
    }
}