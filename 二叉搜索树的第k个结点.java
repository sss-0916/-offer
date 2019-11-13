import java.util.ArrayList;

/*
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
    private ArrayList<TreeNode> list = new ArrayList<>();
    
    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
    
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k <= 0) {
            return null;
        }
        
        inorder(pRoot);
        int size = list.size();
        if (k > size) {
            return null;
        }
        
        return list.get(k - 1);
    }
}