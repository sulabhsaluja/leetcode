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
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int nodeNumber = size - n + 1;

        if (nodeNumber == 1) {
            return head.next;
        }

        int currcount = 1;
        ListNode currNode = head;

        while (currcount < nodeNumber - 1) {
            currNode = currNode.next;
            currcount++;
        }
        currNode.next = currNode.next.next;
        return head;
    }
}
