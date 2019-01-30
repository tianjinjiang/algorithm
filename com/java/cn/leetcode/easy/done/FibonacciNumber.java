package cn.leetcode.easy.done;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 *
 * @author kimtian
 * @date 2019-02-01
 * @num 509
 */
public class FibonacciNumber {
    /**
     * 这道题的主要思想是递归，
     * 从N为2开始，每个数是前两个数的和，所以每次返回值为前两个数的和，
     * 当为0和1时是固定值，作为递归的终止条件
     * 递归一定要有终止条件，要不然可能会导致栈溢出
     *
     * @param N
     * @return
     */
    public static int fib(int N) {
        //当为0时，结果为0，作为递归的终止条件
        if (N == 0) {
            return 0;
        }
        //当为1时，结果为1，作为递归的终止条件
        if (N == 1) {
            return 1;
        }
        //其他情况下结果为前两个值之和
        return fib(N - 1) + fib(N - 2);
    }

    /**
     * 测试
     */
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
