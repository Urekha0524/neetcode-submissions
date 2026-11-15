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
    public void reorderList(ListNode head) {

        ListNode fast,slow;
        fast = head;
        slow = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(second != null){
           ListNode nextNode = second.next;
           second.next = prev;
           prev = second;
           second = nextNode;
        }

        ListNode first = head;
        second = prev;
        while(second !=null){
            ListNode l1Next = first.next;
            ListNode l2Next = second.next;

            first.next = second;
            second.next = l1Next;

            first = l1Next;
            second = l2Next;
        }
        
    }
}
