public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
            return false;
        }
        
        return isPostOrder(sequence, 0, sequence.length - 1);
    }
    
    public boolean isPostOrder(int[] tree, int left, int right){
        if(left >= right){
            return true;
        }
        
        int i = left;
        for(; i < right; ++i){
            if(tree[i] > tree[right]){
                break;
            }
        }
        
        for(int j = i; j < right; ++j){
            if(tree[j] < tree[right]){
                return false;
            }
        }
        
        return isPostOrder(tree, left, i - 1) && isPostOrder(tree, i, right - 1);
    }
}