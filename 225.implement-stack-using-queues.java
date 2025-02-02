/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start

import java.util.Queue;

class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int topElement = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;

    }

    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int topElement = q1.poll();
        q2.add(topElement);

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;

    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
