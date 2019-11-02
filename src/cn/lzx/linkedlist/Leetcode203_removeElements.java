package cn.lzx.linkedlist;

/**
 *@ClassNameLeetcode203_removeElements
 *@Description   移除链表重复元素
 *@Author lzx
 *@Date2019/10/29 21:20
 *@Version V1.0
 **/
public class Leetcode203_removeElements {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        //非空检验
        if(head == null){
            return null;
        }
        //头结点为val
        while(head != null && head.val == val){
            head = head.next;
        }
        //重复节点都在头部
        if(head == null || head.next == null){
            return head;
        }
        ListNode res = head;
        ListNode before = head;
        ListNode after = head.next;
        while(after != null){
            if(after.val == val){
                before.next = after.next;
            }else{
                before = before.next;
            }
            after = after.next;
        }
        return res;
    }


}
