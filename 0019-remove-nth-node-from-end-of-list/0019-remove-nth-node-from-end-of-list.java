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
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int deleteNode = size - n + 1;
        if(deleteNode == 1) return head.next;
        int currCount = 1;
        ListNode currNode = head;

        while(currCount < deleteNode - 1){
            currNode = currNode.next;
            currCount++;
        }
        currNode.next = currNode.next.next;

        return head;
    }
}
