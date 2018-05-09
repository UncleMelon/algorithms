package algorithms.dp;

/**
 * Created by Administrator on 2017/12/1.
 */
public class Coins {

/**
 * 动态规划(Dynamic Programming，所以我们简称动态规划为DP)是运筹学的一个分支，
 * 是求解决策过程(decision process)最优化的数学方法。
 * 20世纪50年代初美国数学家R.E.Bellman等人在研究多阶段决策过程(multistep decision process)的优化问题时，
 * 提出了著名的最优化原理(principle of optimality)，把多阶段过程转化为一系列单阶段问题，利用各阶段之间的关系，逐个求解，
 * 创立了解决这类过程优化问题的新方法——动态规划。1957年出版了他的名著《Dynamic Programming》，这是该领域的第一本著作。
 * 动态规划算法通常基于一个递推公式及一个或多个初始状态。当前子问题的解将由上一次子问题的解推出。
 * 使用动态规划来解题只需要多项式时间复杂度，因此它比回溯法、暴力法等要快许多。
 * 说了这么多术语，想必大家都很头疼，现在让我们通过一个例子来了解一下DP的基本原理。
 **/
    public static void main(String[] args) {
        int[] coins = new int[]{1,3,5};
        int[] dp = new int[12];
        int sum = 11;
        for (int i = 0; i <= sum; i++) {
            dp[i] = i;
        }

        for(int i = 0; i<= sum; i++) {
            for(int j = 0; j < coins.length; j++) {
                if(i >= coins[j] && dp[i] > dp[i - coins[j]] + 1) {
                    dp[i] =  dp[i - coins[j]] + 1;
                }
            }
            showArray(dp);
        }
        System.out.println(dp[11]);
    }


    public static void showArray(int[] array) {
        String str = "";
        for(int i: array) {
            str = str + " " + i;
        }
        System.out.println(str);
    }


}
