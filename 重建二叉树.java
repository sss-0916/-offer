/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null){
            return null;
        }
        
        return buildTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }
    
    public TreeNode buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd){
        TreeNode root = new TreeNode(pre[preStart]);
        
        int rootIndex = 0;
        for(; rootIndex < in.length; ++rootIndex){
            if(in[rootIndex] == root.val){
                break;
            }
        }
        
        int leftLength = rootIndex - inStart;
        int rightLength = inEnd - rootIndex;
        
        if(leftLength > 0){
            root.left = buildTree(pre, preStart + 1, preStart + leftLength, in, inStart, rootIndex - 1);
        }
        
        if(rightLength > 0){
            root.right = buildTree(pre, preStart + 1 + leftLength, preEnd, in, rootIndex + 1, inEnd);
        }
        
        return root;
    }
}