package cn.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 中文：
 * 自分割数是一个可被其包含的每个数字整除的数字。
 * 例如，128是自分割数，因为128％1 == 0,128％2 == 0，128％8 == 0。
 * 此外，不允许自分割数包含数字零。
 * 给定数字的下限和上限，输出每个可能的自划分数的列表，如果可能，包括边界。
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * <p>
 * 注意：
 * 每个输入参数的边界是1 <= left <= right <= 10000。
 * <p>
 * 英文：
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * <p>
 * Note:
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * <p>
 * Note:
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> returnList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            List<Integer> aaa = new ArrayList<>();
            boolean flag = true;
            int z = i;
            while (z > 0) {
                if (z % 10 == 0) {
                    flag = false;
                    z = -1;
                    break;
                }
                aaa.add(z % 10);
                z = z / 10;
            }
            for (int s : aaa) {
                if (i % s != 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                returnList.add(i);
            }

        }
        return returnList;
    }

    public static void main(String[] args) {
        List<Integer> aaa = selfDividingNumbers2(1, 22);
        System.out.println(aaa.size() + "!");
        for (int a : aaa) {
            System.out.println(a);
        }
    }

    public static List<Integer> selfDividingNumbers2(int left, int right) {
        List<Integer> returnList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDividing(i)) {
                returnList.add(i);
            }
        }
        return returnList;
    }

    public static boolean selfDividing(int i) {
        for (char c : String.valueOf(i).toCharArray()) {
            if (c == '0' || (i % (c - '0')) > 0) {
                return false;
            }

        }
        return true;
    }
}
