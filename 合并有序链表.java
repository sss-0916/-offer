/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        
        ListNode result = null;
        ListNode tail = null;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        
        while(cur1 != null && cur2 != null){
            if(cur1.val < cur2.val){
                if(tail == null){
                    tail = result = cur1;
                }else{
                    tail.next = cur1;
                    tail = cur1;
                }
                
                cur1 = cur1.next;
            }else{
                if(tail == null){
                    tail = result = cur2;
                }else{
                    tail.next = cur2;
                    tail = cur2;
                }
                
                cur2 = cur2.next;
            }
        }
        
        if(cur1 != null){
            tail.next = cur1;
        }
        
        if(cur2 != null){
            tail.next = cur2;
        }
        
        return result;
    }
}