import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    private ArrayList<Integer> arr = new ArrayList<>();
    
    public void Insert(Integer num) {
        arr.add(num);
    }

    public Double GetMedian() {
        Collections.sort(arr);
        
        int size = arr.size();
        if (size % 2 == 0) {
            return (arr.get(size / 2) + arr.get(size / 2 - 1)) / 2.0;
        }
        return (double)arr.get(size / 2);
    }
}