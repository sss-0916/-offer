public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int result = array[0];
        int times = 1;
        for (int i = 1; i < array.length; ++i) {
            if (array[i] == result) {
                ++times;
            } else {
                --times;
                if (times == 0) {
                    times = 1;
                    result = array[i];
                }
            }
        }
        
        times = 0;
        for (int i = 0; i < array.length; ++i) {
            if (result == array[i]) {
                ++times;
            }
        }
        return times > array.length / 2 ? result : 0;
    }
}