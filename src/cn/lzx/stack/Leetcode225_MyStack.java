package cn.lzx.stack;

import java.util.LinkedList;

/**
 * @ClassNameLeetcode225_MyStack
 * @Description  队列实现栈
 * @Author lzx
 * @Date2019/11/10 21:41
 * @Version V1.0
 **/
public class Leetcode225_MyStack {

    private LinkedList<Integer> q1;

    private LinkedList<Integer> q2;

    /** Initialize your data structure here. */
    public Leetcode225_MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(q1.isEmpty()){
            q2.add(x);
        }else{
            q1.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q1.isEmpty()){
            while(q2.size() > 1){
                q1.add(q2.remove());
            }
            return q2.remove();
        }else{
            while(q1.size() > 1){
                q2.add(q1.remove());
            }
            return q1.remove();
        }
    }

    /** Get the top element. */
    public int top() {
        if(q1.isEmpty()){
            while(q2.size() > 1){
                q1.add(q2.remove());
            }
            Integer remove = q2.remove();
            q1.add(remove);
            return remove;
        }else{
            while(q1.size() > 1){
                q2.add(q1.remove());
            }
            Integer remove = q1.remove();
            q2.add(remove);
            return remove;
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty()&&q2.isEmpty();
    }


}
