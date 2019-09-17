/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode cur = head.next;
        head.next = null;
        
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = head;
            head = cur;
            
            cur = temp;
        }
        
        return head;
    }
}