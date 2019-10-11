import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String[] strArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            strArr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strArr, new Comparator<String>(){
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        });
        
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strArr.length; ++i) {
            str.append(strArr[i]);
        }
        
        return str.toString();
    }
}