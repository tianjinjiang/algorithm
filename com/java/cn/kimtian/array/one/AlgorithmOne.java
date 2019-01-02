package cn.kimtian.array.one;

import cn.kimtian.Constants;

import java.util.Scanner;

/**
 * 题目：出示一个任意价格的商品（在XXX-XXX元内），参与者要猜这件商品的价格，然后会有人给出相应高了或低了的提示，直到猜出这个价格为止
 * 使用二分法来
 *
 * @author kimtian
 */
public class AlgorithmOne {
    public static void main(String[] args) {
        AlgorithmOne algorithmOne = new AlgorithmOne();
        System.out.println("请输入商品的价格,注意输入一个整数哦！");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        System.out.println("请输入要猜的价格范围，以-分割");
        String range = scanner.next();
        String[] nums = range.split("-");
        //校验分割后的结果只允许为两个值，否则格式不通过
        if (nums.length != Constants.TWO) {
            System.out.println("价格范围输入错误");
        }
        //比较左右两个值，哪个大哪个为heightPrice，哪个小哪个为lowPrice
        else {
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[1]);
            if (num1 > num2) {
                System.out.println(algorithmOne.guessPrice(num2, num1, price));
            } else {
                System.out.println(algorithmOne.guessPrice(num1, num2, price));
            }
        }
    }

    /**
     * 采用二分法
     **/
    public String guessPrice(int lowPrice, int heightPrice, int price) {
        // 判断是否在范围中，不在就不执行后面了，避免死循环
        if (price > heightPrice || price < lowPrice) {
            return "实物价格不在给定范围中";
        } else {
            int height = heightPrice;
            int low = lowPrice;
            int guessPrice = (low + heightPrice) / 2;
            //记录一下执行次数
            int i = 0;
            while (guessPrice != price) {
                // 如果猜大了，那么最大值就是猜的值
                if (guessPrice > price) {
                    height = guessPrice;
                }
                // 如果猜小了，那么最小值就是猜的值
                else if (guessPrice < price) {
                    low = guessPrice;
                }
                guessPrice = (low + height) / 2;
                i++;
            }
            return "共猜了" + (i + 1) + "次，猜到了价格是：" + guessPrice + "元。";
        }

    }
}
