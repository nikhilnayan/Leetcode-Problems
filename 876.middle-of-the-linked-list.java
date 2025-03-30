/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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

        while(temp!=null){
            length++;
            temp = temp.next;
        }

        return length;
    }
    public ListNode middleNode(ListNode head) {
        int length = getLength(head);

        ListNode temp = head;
        if(length%2==0){
            int mid = length/2;

            for(int i=0; i<mid; i++){
                temp = temp.next;
            }

        }else{
            int mid = (length/2)+1;

            for(int i=0; i<mid-1; i++){
                temp = temp.next;
            }
        }

        return temp;
        
    }
}
// @lc code=end

