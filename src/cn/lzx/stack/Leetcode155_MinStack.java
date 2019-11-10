package cn.lzx.stack;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @ClassNameLeetcode155_MinStack
 * @Description  最小栈
 * @Author lzx
 * @Date2019/11/10 21:13
 * @Version V1.0
 **/
public class Leetcode155_MinStack {


    //存储数据
    private Stack<Integer> dataStack;

    //存储最小值
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public Leetcode155_MinStack() {
        dataStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        dataStack.push(x);
        if(minStack.isEmpty() || minStack.peek()>=x)
            minStack.push(x);
    }

    public void pop() {
        int top = dataStack.pop();
        if(minStack.peek() == top){
            minStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }



}
