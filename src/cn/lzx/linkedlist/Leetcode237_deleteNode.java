package cn.lzx.linkedlist;

/**
 *@ClassNameLeetcode237_deleteNode
 *@Description 删除链表节点
 *@Author lzx
 *@Date2019/11/1 22:39
 *@Version V1.0
 **/
public class Leetcode237_deleteNode {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
