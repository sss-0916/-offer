/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        
        ListNode dummyNode = new ListNode(-1);
        ListNode tailNode = dummyNode;
        for (ListNode curNode = pHead; curNode != null; curNode = curNode.next) {
            if (curNode.next != null && curNode.next.val == curNode.val) {
                while (curNode.next != null && curNode.next.val == curNode.val) {
                    curNode = curNode.next;
                }
            } else {
                tailNode.next = curNode;
                tailNode = curNode;
            }
        }
        tailNode.next = null;
        
        return dummyNode.next;
    }
}