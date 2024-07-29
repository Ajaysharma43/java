package day27;
import java.util.*;

public class test1 {
    public static int knap(int[] val , int wt[],int w,int n){
        if(w==0||n==0){
            return 0;
        }
        if(wt[n-1]<w){
            int ans1 = val[n-1]+knap(val,wt,w-wt[n-1],n-1);
            int ans2 = val[n-1]+knap(val,wt,w-w,n-1);
            return Math.max(ans1, ans2);
        }
        else{
            return knap(val,wt,w,n-1);
        }
    }
    public static void main(String[]args){
        int val[] = {15,40,10,25,30};
    }
}
