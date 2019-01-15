package cn.leetcode.easy;

/**
 * You're given strings J representing the types of stones that are jewels,
 * and S representing the stones you have.
 * Each character in S is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 * Input: J = "z", S = "ZZ"
 * Output: 0
 *
 * Note:
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 *
 * @author kimtian
 */
public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        int sum = 0;
        // 字符串S不在规定的范围中,则返回0
        if (S.length() > 50 && S.length() <= 0) {
            return 0;
        } else {
            //先遍历J字符串
            for (int i = 0; i < J.length(); i++) {
                char j = J.charAt(i);
                //再遍历S字符串
                for (int z = 0; z < S.length(); z++) {
                    //如果中是否包含这个char，则总数加1
                    if (S.charAt(z) == j) {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    /**
     * 测试类
     *
     * @param args
     */
    public static void main(String[] args) {
        //两个字符串都为空
        System.out.println(numJewelsInStones("", ""));
        //结果应该为3
        System.out.println(numJewelsInStones("Aa", "aAAbbbb"));
        //结果应该为2
        System.out.println(numJewelsInStones("A", "aAAbbbb"));
        //结果应该为1
        System.out.println(numJewelsInStones("a", "aAAbbbb"));
        //因为区分大小写，所以结果应该为0
        System.out.println(numJewelsInStones("B", "aAAbbbb"));
    }
}
