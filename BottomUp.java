import java.util.*;
public class Main {
    public static int bottomup(int[] coins, int amount) {
        int[] res = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int minCoins = amount + 1;
            for (int coin : coins) {
                int remain = i - coin;
                // If the coin would give us negative change, we
                // will skip it
                if (remain < 0) {
                    continue;
                }
                // We find the minimum number of coins used in
                // remain, otherwise it'll stay at the same value
                minCoins = Math.min(minCoins, res[remain] + 1);
            }
            res[i] = minCoins;
        }
        return res[amount] == amount + 1 ? -1 : res[amount];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        System.out.println(bottomup(arr,sum));
    }
}