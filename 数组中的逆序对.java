public class Solution {
    public int InversePairs(int [] array) {
        if (array == null || array.length <= 1) {
            return 0;
        }
        
        int[] temp = new int[array.length];
        return inversePairs(array, temp, 0, array.length - 1);
    }
    
    private int inversePairs(int[] arr, int[] temp, int left, int right) {
        if (left == right) {
            return 0;
        }
        
        int mid = left + (right - left) / 2;
        int leftCnt = inversePairs(arr, temp, left, mid);
        int rightCnt = inversePairs(arr, temp, mid + 1, right);
        
        int cnt = 0;
        int i = mid, j = right, k = right;
        while (i >= left && j >= mid + 1) {
            if (arr[i] > arr[j]) {
                cnt += j - mid;
                if (cnt > 1000000007) {
                    cnt %= 1000000007;
                }
                temp[k--] = arr[i--];
            } else {
                temp[k--] = arr[j--];
            }
        }
        while (i >= left) {
            temp[k--] = arr[i--];
        }
        while (j >= mid + 1) {
            temp[k--] = arr[j--];
        }
        
        for (i = left; i <= right; ++i) {
            arr[i] = temp[i];
        }
        
        return (leftCnt + rightCnt + cnt) % 1000000007;
    }
}