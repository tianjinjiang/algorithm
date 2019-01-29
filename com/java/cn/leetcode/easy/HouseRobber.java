package cn.leetcode.easy;

/**
 *
 中文：
 你是一个专业的强盗，计划在街上抢劫房屋。
 每个房子都有一定数量的钱存在，阻止你抢劫他们的唯一限制是相邻的房屋有连接的安全系统，
 如果两个相邻的房子在同一个晚上被打破，它将自动联系警察。
 给出一个代表每个房子的金额的非负整数列表，确定今晚可以抢劫的最大金额而不警告警察。
 Example 1:
 Input: [1,2,3,1]
 Output: 4
 Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 Total amount you can rob = 1 + 3 = 4.
 Example 2:
 Input: [2,7,9,3,1]
 Output: 12
 Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 Total amount you can rob = 2 + 9 + 1 = 12.

 英文：
 You are a professional robber planning to rob houses along a street.
 Each house has a certain amount of money stashed,
 the only constraint stopping you from robbing each of them is
 that adjacent houses have security system connected and it will automatically contact the police
 if two adjacent houses were broken into on the same night.
 Given a list of non-negative integers representing the amount of money of each house,
 determine the maximum amount of money you can rob tonight without alerting the police.

 Example 1:
 Input: [1,2,3,1]
 Output: 4
 Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 Total amount you can rob = 1 + 3 = 4.
 Example 2:
 Input: [2,7,9,3,1]
 Output: 12
 Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 Total amount you can rob = 2 + 9 + 1 = 12.

 *  You are a professional robber planning to rob houses along a street.
 *  Each house has a certain amount of money stashed,
 *  the only constraint stopping you from robbing each of them is
 *  that adjacent houses have security system connected and it will automatically contact the police
 *  if two adjacent houses were broken into on the same night.
 *  Given a list of non-negative integers representing the amount of money of each house,
 *  determine the maximum amount of money you can rob tonight without alerting the police.
 *  @author kimtian
 *  @date
 *  @num 198
 */
public class HouseRobber {
    public static int rob(int[] nums) {
        int sum = 0;
        for (int i = 0;i<nums.length;i=i+2){
            sum = sum + nums[i];
        }
        int anotherSum = 0;
        for (int i = 1;i<nums.length;i=i+2){
            anotherSum = anotherSum +nums[i];
        }
        if(sum>=anotherSum){
            return sum;
        }
        else{
            return anotherSum;
        }
    }

    public static void main(String[] args) {
        int[] a = {2,1,1,2};
        rob(a);

    }
}
