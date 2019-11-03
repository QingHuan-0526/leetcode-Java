package cn.lzx.linkedlist;

/**
 *@ClassNameLeetcode23_mergeKLists
 *@Description   合并K个有序链表  分治归并解法
 *@Author lzx
 *@Date2019/11/3 22:33
 *@Version V1.0
 **/
public class Leetcode23_mergeKLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 ){
            return null;
        }
        return sort(lists,0,lists.length-1);
    }

    public ListNode sort(ListNode[] lists,int left,int right){
        if(left == right){
            return lists[left];
        }
        int mid = left + ((right - left)>>1);
        ListNode leftNode = sort(lists,left,mid);
        ListNode rightNode = sort(lists,mid+1,right);
        return merge(leftNode,rightNode);
    }

    public ListNode merge(ListNode left,ListNode right){
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        if(left.val < right.val){
            left.next = merge(left.next,right);
            return left;
        }else{
            right.next = merge(left,right.next);
            return right;
        }
    }



}
