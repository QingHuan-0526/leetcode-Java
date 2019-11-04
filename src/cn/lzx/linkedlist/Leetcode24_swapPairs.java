package cn.lzx.linkedlist;

/**
 *@ClassNameLeetcode24_swapPairs
 *@Description   两两交换链表中的节点
 *@Author lzx
 *@Date2019/11/4 22:41
 *@Version V1.0
 **/
public class Leetcode24_swapPairs {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //先拿到头结点
        ListNode res = head.next;
        //保存每组的前一个节点
        ListNode preNode = null;
        while(head.next != null){
            if(preNode != null){
                preNode.next = head.next;
            }
            preNode = head;
            ListNode nextGroupNode = head.next.next;
            head.next.next = head;
            head.next = nextGroupNode;
            head = nextGroupNode;
            if(head == null){
                break;
            }
        }
        return res;
    }


}
