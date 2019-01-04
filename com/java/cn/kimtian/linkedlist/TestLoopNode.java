package cn.kimtian.linkedlist;

/**
 * 测试对结点的操作
 *
 * @author kimtian
 */
public class TestLoopNode {
    public static void main(String[] args) {
        //创建一个结点
        LoopNode n1 = new LoopNode(1);
        LoopNode n2 = new LoopNode(2);
        LoopNode n3 = new LoopNode(3);
        LoopNode n4 = new LoopNode(4);
        LoopNode n9 = new LoopNode(9);
        n1.addNode(n3);
        n3.addNode(n2);
        n2.addNode(n4);
        System.out.println(n1.next.getData());
        System.out.println(n3.next.getData());
        System.out.println(n2.next.getData());
        System.out.println(n4.next.getData());
        n3.removeNext();

        System.out.println(n1.next.getData());
        System.out.println(n3.next.getData());
        System.out.println(n2.next.getData());
        System.out.println(n4.next.getData());


        System.out.println(n9.next.getData());
    }
}
