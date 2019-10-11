public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index < 1) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        
        int[] result = new int[index];
        int pos2 = 0, pos3 = 0, pos5 = 0;
        // 保存初始状态
        result[0] = 1;
        for (int i = 1; i < index; ++i) {
            result[i] = Math.min(result[pos2] * 2, Math.min(result[pos3] * 3, result[pos5] * 5));
            if (result[i] == result[pos2] * 2) {
                ++pos2;
            }
            if (result[i] == result[pos3] * 3) {
                ++pos3;
            }
            if (result[i] == result[pos5] * 5) {
                ++pos5;
            }
        }
        
        return result[index - 1];
    }
}