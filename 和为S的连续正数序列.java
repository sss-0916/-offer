import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        int left = 1, right = 2;
        while (left < right) {
            int curSum = (left + right) * (right - left + 1) / 2;
            if (curSum > sum) {
                ++left;
            } else if(curSum < sum) {
                ++right;
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i = left; i <= right; ++i) {
                    temp.add(i);
                }
                result.add(temp);
                ++left;
            }
        }
        
        return result;
    }
}