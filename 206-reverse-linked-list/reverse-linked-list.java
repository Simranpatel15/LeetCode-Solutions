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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;                                 //        head
        ListNode curr = head;                                //         1     2 3 4
                                                             //    prev curr  
        while(curr!=null)                                        
        {
            ListNode next = curr.next;                     //  next node ko save

             curr.next = prev;                             // Arrow ulta
                                                           // Pehle: curr -> next    Ab:   curr -> prev
            
             prev = curr;                                  // Previous ko current banao

            curr = next;                                   // Current ko next node par move krnge
        }
        return prev;
    }
                                                         // T: O(n)  S: O(1)
}