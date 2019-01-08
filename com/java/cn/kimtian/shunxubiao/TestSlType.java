package cn.kimtian.shunxubiao;

import java.util.Scanner;

/**
 * 顺序表处理
 *
 * @author kimtian
 */
public class TestSlType {
    public static void main(String[] args) {
        int i;
        SlType slType = new SlType();
        Data1 pdata;
        String key;
        System.out.println("顺序表操作演示");

        slType.slInit(slType);
        System.out.println("初始化顺序表完成");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("输入添加的结点(学号  姓名  年龄)：");
            Data1 data1 = new Data1();
            data1.key = scanner.next();
            data1.name = scanner.next();
            data1.age = scanner.nextInt();
            if (data1.age != 0) {
                //添加结点失败
                if (slType.slAdd(slType, data1) == -1) {
                    break;
                }
            } else {
                break;
            }
        } while (true);
        System.out.println("顺序表中结点顺序为：");
        slType.slAll(slType);
        System.out.println("要取出结点序号为：");
        i = scanner.nextInt();

        pdata = slType.slFindByNum(slType, i);
        if (pdata != null) {
            System.out.printf("第%d个结点为：(%s,%s,%d)\n", i, pdata.key, pdata.name, pdata.age);
        }
        System.out.println("要查找结点的关键字：");
        key = scanner.next();
        i = slType.slFindByKey(slType, key);
        pdata = slType.slFindByNum(slType, i);
        if (pdata != null) {
            System.out.printf("第%d个结点为：(%s,%s,%d)\n", i, pdata.key, pdata.name, pdata.age);
        }


    }
}
