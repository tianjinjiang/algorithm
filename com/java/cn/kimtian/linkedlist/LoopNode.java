package cn.kimtian.linkedlist;

/**
 * 循环链表
 *
 * @author kimtian
 */
public class LoopNode {

    /**
     * 结点内容(存任何类型都可以)
     */
    private int data;

    /**
     * 下一个结点
     */
    LoopNode next = this;

    /**
     * 创建结点的时候，给一个value
     *
     * @param data
     */
    public LoopNode(int data) {
        this.data = data;
    }


    /**
     * 获取结点的下一个结点
     */
    public LoopNode nodeNext() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }

    /**
     * 删除下一个结点
     */
    public void removeNext() {
        //取出下下一个结点
        LoopNode newNext = next.next;
        //把下下一个结点设置为当前结点的下一个结点
        this.next = newNext;
    }

    /**
     * 插入一个结点作为当前结点的下一个结点（在链表中间）
     *
     * @param node 插入的结点
     */
    public void addNode(LoopNode node) {
        //取出下一个结点作为下下一个结点
        LoopNode nextNode = next;
        //把新结点插入为当前结点的下一个结点
        this.next = node;
        //把下下一个结点设置为新结点的下一个结点
        node.next = nextNode;
    }

}
