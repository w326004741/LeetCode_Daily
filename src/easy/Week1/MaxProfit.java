package easy.Week1;

import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.ir.ReturnNode;

import javax.xml.transform.Result;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Weichen Wang
 * @date 2020/11/2 - 11:52 上午
 * @description:
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {

        // 遍历数组， prices[x] prices[y], y = x+1;
        // maxSells < prices[y] - prices[x]


        int maxProfit = 0;
        // Integer.MAX_VALUE，直接判定赋给最小值。 if prices[i] < minPrice -> minPrice = prices[i]
        int minPrice = Integer.MAX_VALUE;


        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (maxProfit < prices[i] - minPrice) {
                maxProfit = prices[i] - minPrice;
            }
        }

        /**嵌套循环 Time Complexity: O(n^2), Leetcode内运行会超时*/
//        for (int x = 0; x < prices.length; x++) {
//            for (int y = x + 1; y < prices.length; y++) {
//                int profit = prices[y] - prices[x];
//                if (profit > maxProfit) {
//                    maxProfit = profit;
//                }
//            }
//        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] temp = {7, 1, 5, 3, 6, 4};

        MaxProfit maxProfit = new MaxProfit();
        maxProfit.maxProfit(temp);

    }
}
