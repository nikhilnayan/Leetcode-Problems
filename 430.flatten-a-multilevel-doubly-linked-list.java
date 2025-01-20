/*
 * @lc app=leetcode id=430 lang=java
 *
 * [430] Flatten a Multilevel Doubly Linked List
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        if (head == null) {
            return null;
        }

        Node curr = head;

        while (curr != null) {

            if (curr.child != null) {
                Node child = curr.child;
                Node next = curr.next;

                Node flattenedChild = flatten(child);

                curr.next = flattenedChild;
                flattenedChild.prev = curr;

                Node tail = flattenedChild;
                while (tail.next != null) {
                    tail = tail.next;
                }

                if (next != null) {
                    tail.next = next;
                    next.prev = tail;
                }

                curr.child = null;

            }
            curr = curr.next;
        }
        return head;
    }
}
// @lc code=end
