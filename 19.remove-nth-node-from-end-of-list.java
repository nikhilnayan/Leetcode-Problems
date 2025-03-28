/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
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

    public static int getLength(ListNode head){
        int length = 0;
        ListNode temp = head;

        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = getLength(head);
        int indexToRemove = length-n;

        if(indexToRemove == 0) return head.next;

        ListNode temp = head;
        for(int i=0; i<indexToRemove-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
// @lc code=end

