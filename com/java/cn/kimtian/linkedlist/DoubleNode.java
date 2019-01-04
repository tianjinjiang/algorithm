package cn.kimtian.linkedlist;

/**
 * 这是一个双向链表
 *
 * @author kimtian
 */
public class DoubleNode {
    /**
     * 结点内容(存任何类型都可以)
     */
    private int data;

    public int getData() {
        return data;
    }

    /**
     * 上一个结点
     */
    DoubleNode preDoubleNode = this;
    /**
     * 下一个结点
     */
    DoubleNode nextDoubleNode = this;

    /**
     * 创建结点的时候，给一个value
     *
     * @param data
     */
    public DoubleNode(int data) {
        this.data = data;
    }

    /**
     * 增加一个结点
     *
     * @param doubleNode 结点
     */
    public void addDoubleNode(DoubleNode doubleNode) {

        //取出下一个结点作为下下一个结点
        DoubleNode nextNode = nextDoubleNode;
        //把新结点插入为当前结点的下一个结点
        this.nextDoubleNode = doubleNode;
        //把当前结点作为新结点的前一个结点
        doubleNode.preDoubleNode = this;
        //把下下一个结点设置为新结点的下一个结点
        doubleNode.nextDoubleNode = nextNode;
        //把下下一个结点的上一个结点设置为新结点
        nextNode.preDoubleNode = doubleNode;
    }

    /**
     * 获取下一个结点的方法
     */
    public DoubleNode getNext() {
        return this.nextDoubleNode;
    }

    /**
     * 获取上一个结点的方法
     */
    public DoubleNode getPre() {
        return this.preDoubleNode;
    }
}
