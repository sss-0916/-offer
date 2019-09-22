import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        // 记录左上和右下的坐标
        int left = 0, top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
        
        while(left <= right && top <= bottom){
            // 左到右
            for(int i = left; i <= right; ++i){
                arr.add(matrix[top][i]);
            }
            
            // 上到下
            for(int i = top + 1; i <= bottom; ++i){
                arr.add(matrix[i][right]);
            }
            
            // 右到左
            if(top != bottom){
                for(int i = right - 1; i >= left; --i){
                    arr.add(matrix[bottom][i]);
                }
            }
            
            // 下到上
            if(left != right){
                for(int i = bottom - 1; i > top; --i){
                    arr.add(matrix[i][left]);
                }
            }
            
            ++left;
            --right;
            ++top;
            --bottom;
        }
        
        return arr;
    }
}