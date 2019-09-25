import java.util.ArrayList;
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        
        ArrayList<TreeNode> queue = new ArrayList<>();
        
        queue.add(root);
        while(queue.size() != 0){
            int qSize = queue.size();
            while(qSize != 0){
                TreeNode temp = queue.remove(0);
                
                result.add(temp.val);
                
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
                
                --qSize;
            }
        }
        
        return result;
    }
}