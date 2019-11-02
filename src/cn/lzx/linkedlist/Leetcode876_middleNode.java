package cn.lzx.linkedlist;

/**
 *@ClassNameLeetcode876_middleNode
 *@Description  链表中间节点
 *@Author lzx
 *@Date2019/11/1 22:38
 *@Version V1.0
 **/
public class Leetcode876_middleNode {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
