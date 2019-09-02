public class Solution {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        
        int curRow = 0;
        int curCol = col - 1;
        while(curRow < row && curCol >= 0){
            if(target > array[curRow][curCol]){
                ++curRow;
            }
            else if(target < array[curRow][curCol]){
                --curCol;
            }
            else{
                return true;
            }
        }
        
        return false;
    }
}