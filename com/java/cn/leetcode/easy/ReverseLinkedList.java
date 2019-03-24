package cn.leetcode.easy;

import cn.leetcode.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //开始是当前结点
        ListNode currentNode = head;
        //循环向后找
        while (true) {
            //取出下一个节点，赋值给当前结点
            ListNode nextNode = currentNode.next;
            //结束标记，如果下一个结点为null,当前结点已经是最后一个结点了
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }

        return null;
    }
}
