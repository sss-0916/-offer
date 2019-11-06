/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
import java.util.HashSet;

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        
        HashSet<ListNode> set = new HashSet<>();
        for (ListNode curNode = pHead; curNode != null; curNode = curNode.next) {
            if (set.contains(curNode)) {
                return curNode;
            }
            set.add(curNode);
        }
        return null;
    }
}