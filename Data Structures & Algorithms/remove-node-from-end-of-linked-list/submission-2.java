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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode faster,slower;
        faster=slower= dummy;

        for(int i=0; i<=n; i++)
           faster = faster.next;
        
        while(faster !=null){
            faster = faster.next;
            slower = slower.next;
        }
        slower.next = slower.next.next;
        
        return dummy.next;
    }
}
