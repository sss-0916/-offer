public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] visited = new boolean[matrix.length];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(search(matrix, rows, cols, i, j, str, 0, visited))
                    return true;
            }
        }
        return false;
    }
    
    public boolean search(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, boolean[] visited) {
        int index = i * cols + j;
        if(i < 0 || i >= rows || j < 0 || j >= cols || str[k] != matrix[index] || visited[index] == true) {
            return false;
        }
        if(k == str.length - 1 && str[k] == matrix[index])
            return true;
        visited[index] = true;
        if(search(matrix, rows, cols, i + 1, j, str, k + 1, visited)  ||
            search(matrix, rows, cols, i - 1, j, str, k + 1, visited) ||
            search(matrix, rows, cols, i, j + 1, str, k + 1, visited) ||
            search(matrix, rows, cols, i, j - 1, str, k + 1, visited))
            return true;
        else {
            visited[index] = false;
            return false;
        }
    }
}