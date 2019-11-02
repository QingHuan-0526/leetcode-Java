package cn.lzx.linkedlist;

/**
 *@ClassNameLeetcode234_isPalindrome
 *@Description   回文链表
 *@Author lzx
 *@Date2019/11/1 22:21
 *@Version V1.0
 **/
public class Leetcode234_isPalindrome {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        //快慢指针寻找中间节点
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reserve(slow);
        while(slow != null && slow != head){
            if(head.val != slow.val){
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;

    }

    //反转链表
    public ListNode reserve(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode before = null;
        while(head != null){
            ListNode next = head.next;
            head.next = before;
            before = head;
            head = next;
        }
        return before;
    }


}
