package cn.lzx.linkedlist;

/**
 *@ClassNameLeetcode206_reverseList
 *@Description
 *@Author lzx
 *@Date2019/10/30 21:18
 *@Version V1.0
 **/
public class Leetcode206_reverseList {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode before = null;
        while(head.next != null){
            ListNode next = head.next;
            head.next = before;
            before = head;
            head = next;
        }
        head.next = before;
        return head;
    }

}
