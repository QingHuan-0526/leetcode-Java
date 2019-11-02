package cn.lzx.linkedlist;

/**
 *@ClassNameLeetcode2_addTwoNumbers
 *@Description
 *@Author lzx
 *@Date2019/10/27 22:52
 *@Version V1.0
 **/
public class Leetcode2_addTwoNumbers {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l5;
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode res = new ListNode(0);
        ListNode first = res;
        //记录是否进位
        boolean flag = false;
        while(l1 != null && l2 != null){
            if(l1.val + l2.val + (flag ? 1 : 0) > 9){
                res.next = new ListNode((l1.val + l2.val + (flag ? 1 : 0)) % 10);
                flag = true;
            }else{
                res.next = new ListNode(l1.val + l2.val + (flag ? 1 : 0));
                flag = false;
            }
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        //处理最后一次进位
        while(flag){
            if(l1 != null){
                //是否会再次进位
                if(l1.val + 1 > 9){
                    res.next = new ListNode((l1.val + 1)%10);
                }else{
                    flag = false;
                    res.next = new ListNode(l1.val + 1);
                }
                l1 = l1.next;
            }else if(l2 != null){
                if(l2.val + 1 > 9){
                    res.next = new ListNode((l2.val + 1)%10);
                }else{
                    flag = false;
                    res.next = new ListNode(l2.val + 1);
                }
                l2 = l2.next;
            }else{
                res.next = new ListNode(1);
                flag = false;
            }
            res = res.next;
        }
        while(l1 != null){
            res.next = new ListNode(l1.val);
            res = res.next;
            l1 = l1.next;
        }
        while(l2 != null){
            res.next = new ListNode(l2.val);
            res = res.next;
            l2 = l2.next;
        }
        return first.next;
    }

}
