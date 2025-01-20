/*
 * @lc app=leetcode id=1472 lang=java
 *
 * [1472] Design Browser History
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class BrowserHistory {

    private List<String> history;
    private int currentIndex;
    private int maxIndex;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        currentIndex = 0;
        maxIndex = 0;
    }

    public void visit(String url) {
        currentIndex++;
        if (currentIndex < history.size()) {
            history.set(currentIndex, url);
        } else {
            history.add(url);
        }
        maxIndex = currentIndex;
    }

    public String back(int steps) {
        currentIndex = Math.max(0, currentIndex - steps);
        return history.get(currentIndex);
    }

    public String forward(int steps) {
        currentIndex = Math.min(maxIndex, currentIndex + steps);
        return history.get(currentIndex);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
// @lc code=end
