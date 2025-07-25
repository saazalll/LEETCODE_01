/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        
        ListNode evenHead = head.next;
        ListNode headCurr = head;
        ListNode evenCurr = evenHead;

        while(evenCurr != null && evenCurr.next != null){
            headCurr.next = evenCurr.next;
            headCurr = headCurr.next;

            evenCurr.next = headCurr.next;
            evenCurr = evenCurr.next;

        }
        headCurr.next = null;
        headCurr.next = evenHead;

        return head;
        
        
    }
    
    
}