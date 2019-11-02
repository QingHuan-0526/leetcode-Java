package cn.lzx.linkedlist;/**
 * Create By lzx on 2019/10/26
 */

/**
 *@ClassNameHasCycle
 *@Description   环型链表
 *@Author lzx
 *@Date2019/10/26 19:47
 *@Version V1.0
 **/
public class Leetcode141_hasCycle {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public boolean hasCycle(ListNode head) {
        //非空检验
        if(head == null || head.next == null){
            return false;
        }
        //快慢指针
        ListNode fast = head.next;
        ListNode slow = head;
        boolean flag = false;
        while(fast != null){
            if(fast == slow){
                flag = true;
                break;
            }
            //防止空指针
            if(fast.next == null){
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return flag;
    }


}
