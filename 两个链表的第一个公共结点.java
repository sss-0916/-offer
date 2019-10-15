/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode curList1 = pHead1, curList2 = pHead2;
        while (curList1 != curList2) {
            curList1 = curList1 == null ? pHead2 : curList1.next;
            curList2 = curList2 == null ? pHead1 : curList2.next;
        }
        
        return curList1;
    }
}