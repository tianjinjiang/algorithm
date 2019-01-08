package cn.kimtian.array.one;

import java.util.ArrayList;

/**
 * 数组测试类
 *
 * @author kimtian
 */
public class TestMyArray {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        int size = myArray.size();
        myArray.printToConsole();
        System.out.println(size);
        myArray.add(99);
        myArray.add(101);
        myArray.add(103);
        myArray.add(108);
        myArray.add(109);
        myArray.add(110);
        myArray.add(116);

        System.out.println(myArray.size());
        myArray.printToConsole();
        myArray.delete(2);
        myArray.printToConsole();
        System.out.println(myArray.get(1));

        myArray.insert(1111, 4);
        myArray.printToConsole();

        ArrayList arrayList = new ArrayList();
        myArray.setIndexElement(2, 2426);
        myArray.printToConsole();


        System.out.println(myArray.dichotomySearch(11111));
        System.out.println("=======");
        myArray.showElement();
    }
}
