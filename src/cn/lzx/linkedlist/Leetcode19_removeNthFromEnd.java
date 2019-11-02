package cn.lzx.linkedlist;

/**
 *@ClassNameLeetcode19_removeNthFromEnd
 *@Description   删除链表的倒数第N个节点
 *@Author lzx
 *@Date2019/11/2 22:33
 *@Version V1.0
 **/
public class Leetcode19_removeNthFromEnd {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        while(n > 0 && fast != null){
            fast = fast.next;
            n--;
        }
        if(n > 0){
            //fast 为null  即总数不足n
            return null;
        }else if(n == 0 && fast == null){
            //n等于链表长度
            return head.next;
        }
        //一般情况
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        //fast到达末尾  slow下一个即要删除的节点
        slow.next = slow.next.next;
        return head;

    }

}
