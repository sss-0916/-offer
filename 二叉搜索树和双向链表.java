/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public TreeNode result = null;
    public TreeNode prev = null;
    
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return result;
        }
        
        convertToDoubleLinkedList(pRootOfTree);
        return result;
    }
    
    private void convertToDoubleLinkedList(TreeNode root) {
        if (root == null) {
            return;
        }
        
        convertToDoubleLinkedList(root.left);
        
        if (result == null) {
            result = root;
            prev = root;
        } else {
            prev.right = root;
            root.left = prev;
            prev = root;
        }
        
        convertToDoubleLinkedList(root.right);
    }
}