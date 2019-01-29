package cn.kimtian.shunxubiao;

/**
 * 顺序表的类
 *
 * @author kimtian
 */
public class SlType {
    /**
     * 顺序表的最大存储数量
     */
    static final int MAXLEN = 100;
    /**
     * 保存顺序表的结构数组
     */
    Data1[] listData = new Data1[MAXLEN + 1];
    /**
     * 顺序表已存结点数量
     */
    int lislen;

    /**
     * 初始化顺序表
     *
     * @param slType 顺序表
     */
    void slInit(SlType slType) {
        //初始化为空表
        slType.lislen = 0;
    }

    /**
     * 计算顺序表长度
     *
     * @param slType 顺序表
     */
    int slLength(SlType slType) {
        //返回顺序表的元素数量
        return (slType.lislen);
    }

    /**
     * 往顺序表中插入值
     *
     * @param slType 顺序表
     * @param n      插入的位置
     * @param data1   插入的值
     * @return
     */
    int slInsert(SlType slType, int n, Data1 data1) {
        int i;
        //顺序表的数量已经超过了顺序表的最大存储数量
        if (slType.lislen > MAXLEN) {
            System.out.println("顺序表已满，不能插入结点！");
            //返回-1表示插入不成功
            return -1;
        }
        //插入元素序号不在范围内
        if (n < 1 || n > slType.lislen - 1) {
            System.out.println("插入元素序号错误，不能插入！");
            //返回-1表示插入不成功
            return -1;
        }
        //将顺序表中的数据向后移动
        for (i = slType.lislen; i >= n; i--) {
            slType.listData[i + 1] = slType.listData[i];
        }
        slType.listData[n] = data1;
        slType.lislen++;
        //成功插入返回1
        return 1;
    }

    /**
     * 增加元素到顺序表尾部
     *
     * @param slType 顺序表
     * @param data1   增加元素
     * @return
     */
    int slAdd(SlType slType, Data1 data1) {
        //顺序表的数量已经超过了顺序表的最大存储数量
        if (slType.lislen > MAXLEN) {
            System.out.println("顺序表已满，不能插入结点！");
            //返回-1表示插入不成功
            return -1;
        }
        slType.listData[++slType.lislen] = data1;
        //成功插入返回1
        return 1;
    }

    /**
     * 删除元素
     *
     * @param slType 顺序表
     * @param n      删除元素的结点
     * @return
     */
    int slDelete(SlType slType, int n) {
        int i;
        //插入元素序号不在范围内
        if (n < 1 || n > slType.lislen - 1) {
            System.out.println("删除元素序号错误，不能删除！");
            //返回-1表示插入不成功
            return -1;
        }
        for (i = n; i < slType.lislen; i++) {
            slType.listData[i] = slType.listData[i + 1];
        }
        slType.lislen--;
        //成功插入返回1
        return 1;
    }

    /**
     * 根据序号返回数据元素
     *
     * @param slType 顺序表
     * @param n      删除元素的结点
     * @return
     */
    Data1 slFindByNum(SlType slType, int n) {
        int i;
        //插入元素序号不在范围内
        if (n < 1 || n > slType.lislen - 1) {
            System.out.println("元素序号错误，不能返回结点！");
            //返回-1表示插入不成功
            return null;
        }
        return slType.listData[n];
    }

    /**
     * 按关键字查询结点
     *
     * @param slType 顺序表
     * @param key    要查找的关键字
     * @return
     */
    int slFindByKey(SlType slType, String key) {
        int i;
        for (i = 1; i < slType.lislen; i++) {
            if (slType.listData[i].key.compareTo(key) == 0) {
                return i;
            }
        }
        //搜索整个表之后都没找到，返回-1
        return -1;
    }

    /**
     * 显示顺序表中的所有结点
     *
     * @param slType 顺序表
     */
    int slAll(SlType slType) {
        int i;
        for (i = 1; i < slType.lislen; i++) {
            System.out.printf("(%s,%s,%d)\n", slType.listData[i].key, slType.listData[i].name, slType.listData[i].age);
        }
        return 0;
    }
}
