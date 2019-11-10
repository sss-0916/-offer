import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) {
            return result;
        }
        
        boolean flag = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> curLevel = new ArrayList<>();
            for (int i = 0; i < size; ++i) {
                TreeNode curNode = queue.poll();
                if (!flag) {
                    curLevel.add(curNode.val);
                } else {
                    curLevel.add(0, curNode.val);
                }
                
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            flag = !flag;
            result.add(curLevel);
        }
        
        return result;
    }
}