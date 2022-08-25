import java.util.*;
public class Main {
    public static int topdown(int[] coins, int amount) {
       int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);//fill the array with maximum value
        dp[0] = 0;//fill the first index with 0
        for (int i = 1; i <= amount; i++) {
           for (int coin: coins) {
              if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
                  dp[i] = Math.min(dp[i], 1 +  dp[i - coin]); 
              }
           } 
        } 
        return (dp[amount] == Integer.MAX_VALUE) ? -1 : dp[amount]; 
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        System.out.println(topdown(arr,sum));
    }
}