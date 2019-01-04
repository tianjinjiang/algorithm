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
    private int data;

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

    /**
     * 为结点追加结点(在链表的结尾)
     *
     * @param node
     */
    public Node appendNode(Node node) {
        //开始是当前结点
        Node currentNode = this;
        //循环向后找
        while (true) {
            //取出下一个节点，赋值给当前结点
            Node nextNode = currentNode.next;
            //结束标记，如果下一个结点为null,当前结点已经是最后一个结点了
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        //把需要追加的结点追加到找到的当前结点的下一个结点
        currentNode.next = node;
        //将自身返回出去
        return this;
    }

    /**
     * 获取结点的下一个结点
     */
    public Node nodeNext() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }

    /**
     * 获取结点的最终结点
     */
    public Node nodeFinal() {
        //开始是当前结点
        Node currentNode = this;
        //循环向后找
        while (true) {
            //取出下一个节点，赋值给当前结点
            Node nextNode = currentNode.next;
            //结束标记，如果下一个结点为null,当前结点已经是最后一个结点了
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        //将自身返回出去
        return currentNode;
    }

    /**
     * 判断当前结点是否为最后结点
     */
    public boolean isLast() {
        return this.next == null;
    }

    /**
     * 删除下一个结点
     */
    public void removeNext() {
        //取出下下一个结点
        Node newNext = next.next;
        //把下下一个结点设置为当前结点的下一个结点
        this.next = newNext;
    }

    /**
     * 插入一个结点作为当前结点的下一个结点（在链表中间）
     *
     * @param node 插入的结点
     */
    public void addNode(Node node) {
        //取出下一个结点作为下下一个结点
        Node nextNode = next;
        //把新结点插入为当前结点的下一个结点
        this.next = node;
        //把下下一个结点设置为新结点的下一个结点
        node.next = nextNode;
    }

    /**
     * 显示所有结点信息
     */
    public void showNodes() {
        Node currentNode = this;
        while (true) {
            System.out.print(currentNode.data + " ");
            //取出下一个结点
            currentNode = currentNode.next;
            //如果是最后一个结点
            if (currentNode == null) {
                break;
            }
        }
        System.out.println();
    }
}
