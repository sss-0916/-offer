import java.util.ArrayList;
import java.util.TreeSet;

public class Solution {
    public ArrayList<String> result = new ArrayList<>();
    public TreeSet<String> set = new TreeSet<>();
    
    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) {
            return result;
        }
        
        permutation(str.toCharArray(), 0);
        result.addAll(set);
        return result;
    }
    
    private void permutation(char[] str, int begin) {
        if (begin == str.length - 1) {
            set.add(String.valueOf(str));
        } else {
            for (int i = begin; i < str.length; ++i) {
                swap(str, i, begin);
                permutation(str, begin + 1);
                swap(str, i, begin);
            }
        }
    }
    
    private void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}