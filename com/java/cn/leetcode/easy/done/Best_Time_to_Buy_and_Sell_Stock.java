package cn.leetcode.easy.done;


/**
 * 假设您有一个数组，其中第i个元素是第i天给定股票的价格。
 * 如果您只被允许完成最多一笔交易（即买入并卖出一股股票），请设计一个算法以找到最大利润。
 * 请注意，在购买之前不能出售股票。
 *
 * @author kimtian
 * @date 2019.01.23
 * @num 121
 */
public class Best_Time_to_Buy_and_Sell_Stock {
    /**
     * 最大利润
     *
     * @param prices 股票价格数组
     * @return 最大利润
     */
    public static int maxProfit2(int[] prices) {
        if(1==1) System.out.println("11");
        //设定初始最大利润
        int maxProfit = 0;
        //初始化数组的最大值
        int maxValue = Integer.MIN_VALUE;
        //初始化数组最大值的索引
        int maxIndex = 0;
        //初始化数组的最小值
        int minValue = Integer.MAX_VALUE;
        //初始化数组最小值的索引
        int minIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            //获取数组的最大值
            if (prices[i] > maxValue) {
                maxValue = prices[i];
                maxIndex = i;
            }
            //获取数组的最小值
            if (prices[i] < minValue) {
                minValue = prices[i];
                minIndex = i;
            }
        }
        //可能的最大利润
        int possibleMaxProfit = maxValue - minValue;
        //如果最小值索引位置比最大值索引位置值小
        if (minIndex < maxIndex) {
            //则最大利润为可能的最大利润
            return possibleMaxProfit;
        }
        //循环数组，一个相当于一个指针指向一个位置，第二个指针在其右侧的位置，比较大小，赋值给最大利润值
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                //大于最大利润，则修改最大利润的值
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                    //为了减少循环次数，如果最小值索引不在最大值索引的左边，最大利润只可能为可能的最大利润-1
                    if (maxProfit >= possibleMaxProfit - 1) {
                        break;
                    }
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] a = new int[]{7, 6, 4, 3, 1};
        System.out.println(maxProfit2(a));
    }

    /**
     * 最大利润
     * @param prices 股票价格数组
     * @return 最大利润
     */
    public static int maxProfit1(int[] prices) {
        //设定初始最大利润
        int maxProfit = 0;
        //循环数组，一个相当于一个指针指向一个位置，第二个指针在其右侧的位置，比较大小，赋值给最大利润值
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                //大于最大利润，则修改最大利润的值
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        return maxProfit;
    }
}


