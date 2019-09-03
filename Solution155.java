import java.util.Stack;

/**
 * @Author: CX
 * @Date: 2019/8/30 下午 2:51
 * @Version 1.0
 * @Project: LeetCode.155  最小栈
 */

class Solution155 {  // class MinStack
    // 存放具体数值的栈
    private Stack<Integer> dataStack;
    // 存放栈的最小元素
    private Stack<Integer> minStack;

    public Solution155() {  // public MinStack()
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        dataStack.push(x);
    }

    public void pop() {
        // 包装类的比较用 equals ！
        if (dataStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
