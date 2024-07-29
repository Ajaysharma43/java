package day27;

public class test3{
    public static int rodcutting(int [] length , int [] price , int todrod,int j){
        int n = price.length;
        int[][] dp = new int[n+1][todrod+1];
        for(int i = 1 ; i < todrod+1 ; i++){
            if(length[i-1]<=j){
                dp[i][j] = Math.max(price[i-1]+dp[i][j-length[i-1]], i);
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][todrod];
    }
    public static void main(String[]args){

    }
}