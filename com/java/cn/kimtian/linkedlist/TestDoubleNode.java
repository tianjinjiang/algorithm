package cn.kimtian.linkedlist;

/**
 * 测试双向链表类
 *
 * @author kimtian
 */
public class TestDoubleNode {

    public static void main(String[] args) {
        DoubleNode d1 = new DoubleNode(1);
        DoubleNode d2 = new DoubleNode(2);
        DoubleNode d3 = new DoubleNode(3);

        //查看上一个结点，自己，下一个结点的内容
        System.out.println(d1.preDoubleNode.getData());
        System.out.println(d1.getData());
        System.out.println(d1.nextDoubleNode.getData());

        d1.addDoubleNode(d2);
        d2.addDoubleNode(d3);
        System.out.println("=========================");
        //查看上一个结点，自己，下一个结点的内容
        System.out.println(d1.preDoubleNode.getData());
        System.out.println(d1.getData());
        System.out.println(d1.nextDoubleNode.getData());
        System.out.println("-------------------------");
        System.out.println(d2.preDoubleNode.getData());
        System.out.println(d2.getData());
        System.out.println(d2.nextDoubleNode.getData());
        System.out.println("-------------------------");
        System.out.println(d3.preDoubleNode.getData());
        System.out.println(d3.getData());
        System.out.println(d3.nextDoubleNode.getData());
    }
}
