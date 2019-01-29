package cn.leetcode.linkedlist;

import cn.kimtian.linkedlist.Node;

import java.util.HashMap;

/**
 * 1.如何判断一个链表是否有环
 * 2.如果有环，找到环入口
 * 3.如果有环，求环的长度
 *
 * @author kimtian
 */
public class LinkLoop {
    public static void main(String[] args) {
        //创建一个链表，为A->B->C->D->E->B
        Node nA = new Node(1);
        Node nB = new Node(2);
        Node nC = new Node(3);
        Node nD = new Node(4);
        Node nE = new Node(5);
        nA.next = nB;
        nB.next = nC;
        nC.next = nD;
        nD.next = nE;
        //这句使其成为一个带环的链表
        nE.next = nB;
        System.out.println(hasLoop(nA));
        System.out.println(searchEntranceNode(nA).getData());
        System.out.println(circleLength(nA));
    }

    /**
     * 方法一：创建两个指针，一个走一步，一个走两步，如果两个指针最后重合，说明这个链表有环
     *
     * @param n 链表头结点
     * @return 是否有环
     */
    public static boolean hasLoop(Node n) {
        //单链表为空时，单链表没有环
        if (n == null) {
            return false;
        }
        //单链表中只有头结点，而且头结点的next为空，单链表没有环
        if (n.next == null) {
            return false;
        }
        //定义两个指针tmp1,tmp2,一个走一步，一个走两部
        Node tmp1 = n.next;
        Node tmp2 = n.next.next;

        while (tmp2 != null) {
            if (tmp1.getData() == tmp2.getData()) {
                //如果两个指针最后重逢，说明存在环，否则不存在
                return true;
            }
            //每次迭代指针一走一步，指针二走两步
            tmp1 = tmp1.next;
            //如果下一个都为空了，就不要找下下一个的值了，防止空指针异常
            if (tmp2.next != null) {
                tmp2 = tmp2.next.next;
            }
            //没有下一个指向了，说明不是环
            else {
                return false;
            }
        }
        return false;
    }

    /**
     * 方法二：将每次走过的结点保存到hash表中，如果结点在hash表中，则表示存在环
     *
     * @param n 链表头结点
     * @return 是否有环
     */
    public static boolean hasLoop2(Node n) {
        Node temp1 = n;
        HashMap<Node, Node> ns = new HashMap<Node, Node>();
        while (n != null) {
            if (ns.get(temp1) != null) {
                return true;
            } else {
                ns.put(temp1, temp1);
            }
            temp1 = temp1.next;
            if (temp1 == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * 如果有环，求环的入口结点
     *
     * @param n 链表头结点
     * @return 入口结点
     */
    public static Node searchEntranceNode(Node n) {
        //单链表为空时，单链表没有环
        if (n == null) {
            return null;
        }
        //单链表中只有头结点，而且头结点的next为空，单链表没有环
        if (n.next == null) {
            return null;
        }
        //定义两个指针tmp1,tmp2,一个走一步，一个走两部
        Node tmp1 = n.next;
        Node tmp2 = n.next.next;

        while (tmp2 != null) {
            if (tmp1.getData() == tmp2.getData()) {
                //如果两个指针最后重逢，说明存在环，否则不存在
                break;
            }
            //每次迭代指针一走一步，指针二走两步
            tmp1 = tmp1.next;
            //如果下一个都为空了，就不要找下下一个的值了，防止空指针异常
            if (tmp2.next != null) {
                tmp2 = tmp2.next.next;
            }
            //没有下一个指向了，说明不是环
            else {
                return null;
            }
        }
        //这里直接等于头结点，没有向下走一步，因为头结点有可能就是环的入口结点
        tmp2 = n;
        //假设两个指针第一次相遇点为m，此时令一个指针从头结点向下走，每次走一步，令另一个指针从相遇点往下走，每次走一步，两个指针相遇的位置，为入口处
        while (tmp2 != null) {
            if (tmp1.getData() == tmp2.getData()) {
                return tmp1;
            }
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }

        return null;
    }

    /**
     * 如果有环，求环的长度
     * 设置一个指针q指向环的入口，让q往后移动直到q再次等于环的入口结点，此时q所走的步数就是环的长度
     *
     * @param n 链表头结点
     * @return 入口结点
     */
    public static int circleLength(Node n) {
        Node p = searchEntranceNode(n);
        //不存在环时，返回0
        if (p == null) {
            return 0;
        }
        Node q = p.next;
        int length = 1;
        while (p != q) {
            length++;
            q = q.next;
        }
        //返回环的长度
        return length;
    }
}
