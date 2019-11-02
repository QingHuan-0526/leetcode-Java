package cn.lzx.linkedlist;

/**
 * @ClassNameMergeTwoLists
 * @Description 合并两个有序链表
 * @Author lzx
 * @Date2019/10/26 18:44
 * @Version V1.0
 **/
public class Leetcode21_mergeTwoLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    //迭代
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        //合并后的链表
        ListNode res = new ListNode(0);
        //保留头结点引用
        ListNode first = res;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                res.next = l2;
                l2 = l2.next;
            } else {
                res.next = l1;
                l1 = l1.next;
            }
            res = res.next;
        }
        while (l1 != null) {
            res.next = l1;
            l1 = l1.next;
            res = res.next;
        }
        while (l2 != null) {
            res.next = l2;
            l2 = l2.next;
            res = res.next;
        }
        return first.next;
    }

    //递归
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if (l1.val < l2.val){
            l1.next = mergeTwoLists2(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists2(l1,l2.next);
            return l2;
        }
    }

}
