package cn.kimtian.linkedlist;

/**
 * 这是链表的一个结点
 *
 * @author kimtian
 */
public class Node {

    /**
     * 结点内容(存任何类型都可以)
     */
    int data;

    /**
     * 下一个结点
     */
    Node next;

    /**
     * 创建结点的时候，给一个value
     *
     * @param data
     */
    public Node(int data) {
        this.data = data;
    }
}
