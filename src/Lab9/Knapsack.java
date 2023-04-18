package Lab9;

import java.util.HashMap;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Knapsack {

    public static int knapsack(int W, int[] wt, int[] val, int n) {
        // create a 2D array to store the maximum value that can be obtained
        // with i items and j capacity
        int[][] dp = new int[n + 1][W + 1];

        // initialize the array with 0
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = 0;
            }
        }

        // fill the array using dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt[i - 1]] + val[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // return the maximum value that can be obtained with a knapsack of weight W
        return dp[n][W];
    }

    public static int knapsack2(int W, int[] wt, int[] val, int n) {
        // create a 2D array to store the maximum value that can be obtained
        // with i items and j capacity
        int[][] dp = new int[n + 1][W + 1];

        // initialize the array with 0
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = 0;
            }
        }

        // fill the array using dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - wt[i - 1]] + val[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // return the maximum value that can be obtained with a knapsack of weight W
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] values = {34, 43, 52, 38};
        int[] weights = {10, 20, 30, 40};
        int W = 90;

        System.out.println("Maximum value that can be obtained: " + knapsack(W, weights, values, values.length));

        int[] val = { 10, 40, 50, 70 };
        int[] wt = { 1, 3, 4, 5 };
        int Weight = 8;

        System.out.println("Maximum value that can be obtained: " + knapsack2(Weight, wt, val, val.length));
    }
}