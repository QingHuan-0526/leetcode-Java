package cn.lzx.stack;

import java.util.Stack;

/**
 * @ClassNameLeetcode232_MyQueue
 * @Description 栈实现队列
 * @Author lzx
 * @Date2019/11/10 22:16
 * @Version V1.0
 **/
public class Leetcode232_MyQueue {

    //入口
    private Stack<Integer> pushStack;
    //出口
    private Stack<Integer> popStack;

    /** Initialize your data structure here. */
    public Leetcode232_MyQueue() {
        pushStack = new Stack<Integer>();
        popStack = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        pushStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(popStack.isEmpty()){
            while(!pushStack.isEmpty()){
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(popStack.isEmpty()){
            while(!pushStack.isEmpty()){
                popStack.push(pushStack.pop());
            }
        }
        return popStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return pushStack.isEmpty()&&popStack.isEmpty();
    }

}
