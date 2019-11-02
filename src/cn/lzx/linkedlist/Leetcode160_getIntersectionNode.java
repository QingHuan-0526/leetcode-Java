package cn.lzx.linkedlist;


/**
 *@ClassNameLeetcode160_getIntersectionNode
 *@Description  两链表交点
 *@Author lzx
 *@Date2019/10/28 20:38
 *@Version V1.0
 **/
public class Leetcode160_getIntersectionNode {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //非空检验
        if(headA == null || headB == null){
            return null;
        }
        ListNode firstA = headA;
        ListNode firstB = headB;
        //先判断是否相交
        ListNode l1 = headA;
        ListNode l2 = headB;
        while(l1.next != null){
            l1 = l1.next;
        }
        while(l2.next != null){
            l2 = l2.next;
        }
        if(l1 != l2){
            return null;
        }
        //相交
        while(headA != null && headB!= null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
            if(headA == null){
                headA = firstB;
            }
            if(headB == null){
                headB = firstA;
            }
        }
        return null;
    }


}
