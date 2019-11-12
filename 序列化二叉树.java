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
    private int index = -1;
    
    String Serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        
        if (root == null) {
            str.append("#,");
            return str.toString();
        }
        
        str.append(root.val + ",");
        str.append(Serialize(root.left));
        str.append(Serialize(root.right));
        
        return str.toString();
    }
    
    TreeNode Deserialize(String str) {
        ++index;
        
        int len = str.length();
        if (index >= len) {
            return null;
        }
        
        String[] strArr = str.split(",");
        TreeNode root = null;
        if (!strArr[index].equals("#")) {
            root = new TreeNode(Integer.valueOf(strArr[index]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);
        }
        
        return root;
    }
}