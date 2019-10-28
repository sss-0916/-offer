import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        
        int zero = 0, cntOfInterval = 0;
        
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length - 1; ++i) {
            if (numbers[i] == 0) {
                ++zero;
                continue;
            }
            if (numbers[i] == numbers[i + 1]) {
                return false;
            }
            cntOfInterval += numbers[i + 1] - numbers[i] - 1;
        }
        
        return cntOfInterval > zero ? false : true;
    }
}