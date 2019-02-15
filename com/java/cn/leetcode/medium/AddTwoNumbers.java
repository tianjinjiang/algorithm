package cn.leetcode.medium;

import cn.kimtian.linkedlist.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kimtian
 * @date 2019.02.
 * @num 2
 */
public class AddTwoNumbers {
    public static Node addTwoNumbers(Node l1, Node l2) {
        List<Integer> listL1 = new ArrayList<Integer>();
        while (l1 != null) {
            listL1.add(l1.getData());
            l1 = l1.next;
        }
        List listL2 = new ArrayList();
        while (l2 != null) {
            listL2.add(l2.getData());
            l2 = l2.next;
        }
        int total = calNum(listL1) + calNum(listL2);
        String stotal = "" + total;
        char[] chars = stotal.toCharArray();
        Node node = new Node(chars[chars.length - 1] - '0');
        for (int i = chars.length - 2; i >= 0; i--) {
            node.appendNode(new Node(chars[i] - '0'));
        }
        return node;
    }

    public static int calNum(List list) {
        StringBuffer a = new StringBuffer();
        for (int i = list.size() - 1; i >= 0; i--) {
            a.append(list.get(i));
        }
        int aa = Integer.parseInt(a.toString());
        return aa;
    }

    public static void main(String[] args) {
        //创建一个结点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n9 = new Node(9);
        n1.appendNode(n2).appendNode(n3).appendNode(n4);
        n5.appendNode(n6).appendNode(n7).appendNode(n9);
        Node aaaa = addTwoNumbers(n1, n5);
        aaaa.showNodes();
    }
}
