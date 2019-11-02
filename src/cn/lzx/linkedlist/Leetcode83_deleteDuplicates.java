package cn.lzx.linkedlist;

/**
 *@ClassNameDeleteDuplicates
 *@Description  删除排序链表中的重复元素
 *@Author lzx
 *@Date2019/10/26 19:28
 *@Version V1.0
 **/
public class Leetcode83_deleteDuplicates {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public ListNode deleteDuplicates(ListNode head) {
        //非空检验
        if(head == null){
            return head;
        }
        //保留头结点引用
        ListNode res = head;

        //遍历删除重复节点
        while(head.next != null){
            //重复节点
            if(head.val == head.next.val){
                //到达尾节点
                if(head.next.next != null){
                    head.next = head.next.next;
                }else{
                    //没有到达尾节点
                    head.next = null;
                    break;
                }
            }else{
                //非重复节点
                head = head.next;
            }
        }
        return res;
    }


}
