import java.util.ArrayList;

/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    private ArrayList<TreeLinkNode> list = new ArrayList<>();
    
    private void inorder(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
    
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        
        TreeLinkNode root = pNode;
        while (root.next != null) {
            root = root.next;
        }
        
        inorder(root);
        
        int size = list.size();
        int i = 0;
        for (; i < size; ++i) {
            if (list.get(i) == pNode) {
                break;
            }
        }
        
        return i == size - 1 ? null : list.get(i + 1);
    }
}