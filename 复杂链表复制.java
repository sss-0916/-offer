/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        
        RandomListNode curNode = pHead;
        while (curNode != null) {
            RandomListNode node = new RandomListNode(curNode.label);
            node.next = curNode.next;
            curNode.next = node;
            
            curNode = node.next;
        }
        
        curNode = pHead;
        while (curNode != null) {
            RandomListNode temp = curNode.next;
            if (curNode.random != null) {
                temp.random = curNode.random.next;
            }
            
            curNode = temp.next;
        }
        
        curNode = pHead;
        RandomListNode result = pHead.next;
        while (curNode != null) {
            RandomListNode temp = curNode.next;
            curNode.next = temp.next;
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
            
            curNode = curNode.next;
        }
        return result;
    }
}