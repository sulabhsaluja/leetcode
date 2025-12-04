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
        ListNode temp = head; //temp variable to count the total length of the list
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int deleteNode = size - n + 1; // index of node to be deleted(starting from 1).
        if(deleteNode == 1) return head.next;
        int currCount = 1;
        ListNode currNode = head;

        while(currCount < deleteNode - 1){ 
            currNode = currNode.next; //make currNode the previous of node to be deleted
            currCount++;
        }
        currNode.next = currNode.next.next; // delete the next node to currNode by skipping it.

        return head; // return the updated list.
    }
}
