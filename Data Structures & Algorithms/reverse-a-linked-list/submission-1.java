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
//0 -> 1
// 1 -> next -> 0 -> null
//reverselist(0)
//head.val = 0
//head.next = 1
//reverselist(head.next)
//head.val = 1
//head.next =  null
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return curr;

    }
}
