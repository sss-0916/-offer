public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] result = new int[array.length];
        // 初始状态
        result[0] = array[0];
        for (int i = 1; i < array.length; ++i) {
            result[i] = Math.max(result[i - 1] + array[i], array[i]);
        }
        
        int maxSum = result[0];
        for (int i = 1; i < result.length; ++i) {
            if (result[i] > maxSum) {
                maxSum = result[i];
            }
        }
        return maxSum;
    }
}