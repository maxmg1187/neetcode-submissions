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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(0);
        ListNode sentinel = merged;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val){
            sentinel.next = list1;
            list1 = list1.next;
            }
            else{
            sentinel.next = list2;
            list2 = list2.next;
             }
            sentinel = sentinel.next;
        }

        if(list1 == null){
            sentinel.next = list2;
        }
        else{
            sentinel.next = list1;
        }
    
        return merged.next;
}
}