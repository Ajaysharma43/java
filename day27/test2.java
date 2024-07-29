package day27;

public class test2 {
    public static int knap(int[] val, int wt[], int w, int n, int[][] dp) {
        if (w == 0 || n == 0) {
            return 0;
        }
        if (dp[n][w] != -1) {
            return dp[n][w];
        }
        if (wt[n - 1] < w) {
            int ans1 = val[n - 1] + knap(val, wt, w - wt[n - 1], n - 1, dp);
            int ans2 = knap(val, wt, w, n - 1, dp);
            dp[n][w] = Math.max(ans1, ans2);
            return dp[n][w];
        } else {
            dp[n][w] = knap(val, wt, w, n - 1, dp);
            return dp[n][w];
        }
        // if(wt[n-1]<w){
        // int ans1 = val[n-1]+knap(val,wt,w-wt[n-1],n-1);
        // int ans2 = val[n-1]+knap(val,wt,w-w,n-1);
        // return Math.max(ans1, ans2);
        // }
        // else{
        // return knap(val,wt,w,n-1);
        // }
    }

    public static void main(String[] args) {
        int[] val = { 15, 14, 10, 45, 30 };
        int wt[] = { 12, 5, 1, 3, 4 };
        int w = 7;
        int[][] dp = new int[val.length + 1][w + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knap(val, wt, w, val.length, dp));
    }
}
