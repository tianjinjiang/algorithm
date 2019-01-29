package cn.kimtian.linkedlist.two;

import cn.kimtian.shunxubiao.Data1;
import cn.kimtian.shunxubiao.SlType;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 链式表处理
 *
 * @author kimtian
 */
public class TestClType {
    public static void main(String[] args) {
        ClType node, head = null;
        ClType clType = new ClType();
        String key, findkey;
        Scanner scanner = new Scanner(System.in);
        System.out.println("链表测试，先输入链表中的数据，格式为： 关键字 姓名  年龄");

        do {
            Data2 nodeData = new Data2();
            nodeData.key = scanner.next();
            if (("0").equals(nodeData.key)) {
                break;
            } else {
                nodeData.name = scanner.next();
                nodeData.age = scanner.nextInt();
                head = clType.clAddEnd(head, nodeData);
            }
        } while (true);
        //显示所有结点
        clType.clShowAllNode(head);
        System.out.println("插入结点，输入插入位置的关键字：");
        findkey = scanner.next();
        System.out.println("输入插入结点的数据(关键字 姓名 年龄)：");
        Data2 data2 = new Data2();
        //输出插入结点数据
        data2.key = scanner.next();
        data2.name = scanner.next();
        data2.age = scanner.nextInt();
        //调用插入函数
        head = clType.clInsertNode(head, findkey, data2);
        //显示所有结点
        clType.clShowAllNode(head);

        System.out.println("删除结点，输入删除结点的关键字：");
        key = scanner.next();
        //调用删除结点函数
        clType.clDeleteNode(head, key);
        //显示所有结点
        clType.clShowAllNode(head);

        System.out.println("查找结点，输入查找关键字：");
        key = scanner.next();
        node = clType.clFindNode(head, key);
        if (node != null) {
            data2 = node.nodeData;
            System.out.printf("关键字%s对应的结点为(%s,%s,%d)\n", key, data2.key, data2.name, data2.age);
        } else {
            System.out.printf("在链表中未找到关键字未%s的结点！\n", key);
        }


    }
}
