package cn.kimtian.linkedlist;

/**
 * 测试对结点的操作
 *
 * @author kimtian
 */
public class TestNode {
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
        n3.addNode(n9);
        n1.appendNode(n5);
        n2.appendNode(n6);
        n1.appendNode(n7);
        n1.showNodes();
        n1.next.removeNext();
        n1.showNodes();
//        System.out.println(n1.next.getData());
//        System.out.println(n1.next.next.getData());
//        System.out.println(n1.next.next.next.getData());
//        System.out.println(n1.next.next.next.next.getData());
//        System.out.println(n1.next.next.next.next.next.getData());
//        System.out.println(n1.next.next.next.next.next.next.getData());
//        System.out.println("最终：" + n1.nodeFinal().getData());
//        System.out.println("是否：" + n7.isLast());
//        System.out.println("是否：" + n4.next.next.isLast());
    }
}
