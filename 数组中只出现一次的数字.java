//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        num1[0] = 0;
        num2[0] = 0;
        
        int temp = 0;
        for (int i = 0; i < array.length; ++i) {
            temp ^= array[i];
        }
        
        int pos = findFirst1(temp);
        for (int i = 0; i < array.length; ++i) {
            if (bitIs1(array[i], pos)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }
    
    private boolean bitIs1(int num, int pos) {
        return ((num >>> pos) & 1) == 1;
    }
    
    private int findFirst1(int num) {
        int index = 0;
        while (((num & 1) == 0) && index <32) {
            ++index;
            num >>>= 1;
        }
        
        return index;
    }
}