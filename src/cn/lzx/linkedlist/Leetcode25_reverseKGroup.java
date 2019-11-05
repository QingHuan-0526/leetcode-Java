package cn.lzx.linkedlist;

/**
 *@ClassNameLeetcode25_reverseKGroup
 *@Description   K个一组反转链表
 *@Author lzx
 *@Date2019/11/5 20:50
 *@Version V1.0
 **/
public class Leetcode25_reverseKGroup {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        //小于一组检验
        ListNode tmp = head;
        int i = 1;
        while(tmp.next != null){
            tmp = tmp.next;
            i++;
        }
        if(i < k){
            return head;
        }
        //每组的头结点（用于反转）
        ListNode GroupFirstNode = head;
        //前一组反转后的尾节点（用于后一组反转完成后连接起来）
        ListNode preGroupNode = null;
        //保留第一组反转之后的头结点 用于返回
        ListNode res = head;
        int index = 1;
        while(head != null){
            //完整一组 开始反转
            if(index % k == 0){
                //保留下一组的头结点
                ListNode next = head.next;
                //切断当前组的后序节点
                head.next = null;
                //反转当前组
                ListNode GroupNewNode = reverse(GroupFirstNode);
                //第一组 用于保留头结点返回
                if(index == k){
                    res = GroupNewNode;
                }
                //将上一组反转后的尾节点和当前组反转后的头结点相连
                if(preGroupNode != null){
                    preGroupNode.next = GroupNewNode;
                }
                //获得反转后的尾节点
                while(GroupNewNode.next != null){
                    GroupNewNode = GroupNewNode.next;
                }
                //更新尾节点
                preGroupNode = GroupNewNode;
                //更新下一组的头结点
                GroupFirstNode = next;
                head = next;
                index++;
            }else{
                head = head.next;
                index++;
            }
        }
        //连接最后不足一个分组的数据
        ListNode cur = res;
        while(res.next != null){
            res = res.next;
        }
        res.next = GroupFirstNode;
        return cur;
    }

    //反转链表
    public ListNode reverse(ListNode node){
        ListNode pre = null;
        while(node.next != null){
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        node.next = pre;
        return node;
    }



}
