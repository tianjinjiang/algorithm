package cn.leetcode.easy.done;

import cn.kimtian.linkedlist.Node;

/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * If there are two middle nodes, return the second middle node.
 *
 * @author kimtian
 * @date 2019.02.13
 * @num 876
 */
public class MiddleOfTheLinkedList {
    /**
     * 先获取链表的长度，获取最中间的结点；
     * 然后将头指针指向最中间的结点，并返回新的链表
     * @param head
     * @return
     */
    public static Node middleNode(Node head) {
        //链表长度为1
        int length = 1;
        //将头结点的下一个结点作为新结点
        Node zz = head.next;
        //如果不是最后一个结点，还有下一个结点，则将长度+1，求出链表的长度
        while (zz != null) {
            length++;
            //将下一个结点赋值给当前结点
            zz = zz.next;
        }
        //求出数组的中位结点
        int middle = length / 2 + 1;
        //移动头指针到中位结点
        for (int i = 1; i < middle; i++) {
            head = head.next;
        }
        //并将其返回
        return head;
    }

    /**
     * 测试类
     *
     * @param args
     */
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        n1.appendNode(n2).appendNode(n3).appendNode(n4).appendNode(n5).appendNode(n6);
        Node a = middleNode(n1);
        a.showNodes();

    }
}
