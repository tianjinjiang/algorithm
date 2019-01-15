package cn.kimtian.linkedlist.two;

/**
 * 链表的类
 *
 * @author kimtian
 */
public class ClType {
    /**
     * 结点数据
     */
    Data2 nodeData = new Data2();
    /**
     * 下一个结点
     */
    ClType nextNode;

    /**
     * 为链表追加结点
     *
     * @param head     头结点
     * @param nodeData 追加的结点数据
     * @return ClType 头结点
     */
    ClType clAddEnd(ClType head, Data2 nodeData) {
        ClType node, htemp;
        //分配内存失败
        if ((node = new ClType()) == null) {
            System.out.println("申请内存失败！");
            return null;
        } else {
            //保存数据
            node.nodeData = nodeData;
            //设置结点引用为空，即是尾结点
            node.nextNode = null;
            //头引用
            if (head == null) {
                head = node;
                return head;
            }
            htemp = head;
            //查找链表的末尾
            while (htemp.nextNode != null) {
                htemp = htemp.nextNode;
            }
            htemp.nextNode = node;
            return head;

        }
    }

    /**
     * 插入头结点
     *
     * @param head     头结点
     * @param nodeData 插入数据
     * @return
     */
    ClType clAddFirst(ClType head, Data2 nodeData) {
        ClType node;

        //分配内存失败
        if ((node = new ClType()) == null) {
            System.out.println("申请内存失败！");
            return null;
        } else {
            node.nodeData = nodeData;
            node.nextNode = head;
            head = node;
            return head;
        }
    }

    /**
     * 查找结点
     *
     * @param head 头结点
     * @param key  查找的关键字
     * @return
     */
    ClType clFindNode(ClType head, String key) {
        ClType htemp;
        htemp = head;
        while (htemp != null) {
            if (htemp.nodeData.key.compareTo(key) == 0) {
                return htemp;
            }
            htemp = htemp.nextNode;
        }
        return null;
    }

    /**
     * 插入结点
     *
     * @param head     头结点
     * @param findkey  查找的结点关键字
     * @param nodeData 插入的结点值
     * @return
     */
    ClType clInsertNode(ClType head, String findkey, Data2 nodeData) {
        ClType node, nodetemp;
        //分配内存失败
        if ((node = new ClType()) == null) {
            System.out.println("申请内存失败！");
            return null;
        }
        node.nodeData = nodeData;
        nodetemp = clFindNode(head, findkey);
        if (nodetemp != null) {
            node.nextNode = nodetemp.nextNode;
            nodetemp.nextNode = node;
        } else {
            System.out.println("未找到正确的插入位置！");
        }
        return head;
    }

    /**
     * 删除结点
     *
     * @param head 头结点
     * @param key  查找的关键字
     * @return
     */
    int clDeleteNode(ClType head, String key) {
        ClType node, htemp;
        htemp = head;
        node = head;
        while (htemp != null) {
            if (htemp.nodeData.key.compareTo(key) == 0) {
                //使前一结点指向当前结点的下一结点
                node.nextNode = htemp.nextNode;
                //释放内存
                htemp = null;
                return 1;
            } else {
                //指向当前结点
                node = htemp;
                //指向下一结点
                htemp = htemp.nextNode;
            }
        }
        //未删除
        return 0;
    }

    /**
     * 计算链表的长度
     *
     * @param head 头结点
     * @return 链表长度
     */
    int clLength(ClType head) {
        ClType htemp;
        int len = 0;
        htemp = head;
        while (htemp != null) {
            len++;
            htemp = htemp.nextNode;
        }
        return len;
    }

    /**
     * 显示链表所有结点
     *
     * @param head
     */
    void clShowAllNode(ClType head) {
        ClType htemp;
        Data2 nodeData;

        htemp = head;
        System.out.printf("当前链表共有%d个结点。链表所有数据如下：\n", clLength(head));
        while (htemp != null) {
            //获取结点数据
            nodeData = htemp.nodeData;
            System.out.printf("结点(%s,%s,%d)\n", nodeData.key, nodeData.name, nodeData.age);
            //处理下一节点
            htemp = htemp.nextNode;
        }

    }

}
