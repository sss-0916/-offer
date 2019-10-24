import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int left = 0, right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] == sum) {
                result.add(array[left]);
                result.add(array[right]);
                break;
            }
            while (left < right && array[left] + array[right] > sum) {
                --right;
            }
            while (left < right && array[left] + array[right] < sum) {
                ++left;
            }
        }
        
        return result;
    }
}