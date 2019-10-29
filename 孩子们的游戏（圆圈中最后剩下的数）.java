import java.util.ArrayList;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n <= 0) {
            return -1;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            arr.add(i);
        }
        
        int tempIndex = (m - 1) % arr.size();
        while (arr.size() != 1) {
            arr.remove(tempIndex);
            tempIndex = (tempIndex + m - 1) % arr.size();
        }
        
        return arr.get(0);
    }
}