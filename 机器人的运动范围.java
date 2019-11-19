public class Solution {
    public int movingCount(int threshold, int rows, int cols) {
        int[][] i = new int[rows][cols];
        return moving(i,threshold,0,0);
    }
    
    public int moving(int[][] i,int threshold, int row, int col) {
        if(row < 0 || row > i.length - 1 || col > i[0].length - 1 
            || col < 0 || i[row][col] == 1 || threshold < cSum(row,col)) {
            return 0;
        }
        i[row][col] = 1;
        return moving(i, threshold, row+1, col) +
            moving(i, threshold, row-1, col) +
            moving(i, threshold, row, col + 1) +
            moving(i, threshold, row, col - 1) + 1;
    }
    
    public int cSum(int row, int col) {
        int sum =0;
        do {
            sum += row % 10;
            row = row / 10;
        } while (row > 0);
        do {
            sum += col % 10;
            col = col / 10;
        } while (col > 0);
        return sum;
    }
}