public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        
        B[0] = 1;
        for (int i = 1; i < A.length; ++i) {
            B[i] = A[i - 1] * B[i - 1];
        }
        
        int temp = 1;
        for (int i = A.length - 2; i >= 0; --i) {
            temp *= A[i + 1];
            B[i] *= temp;
        }
        
        return B;
    }
}