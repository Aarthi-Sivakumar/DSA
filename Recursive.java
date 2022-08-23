import java.util.*;
class Main{
    public static int recursive(int arr[], int numberOfcoins, int sum){
       if (sum == 0){ 
           return 0;
       }
       int res = Integer.MAX_VALUE;//to avoid overfolw
       for (int i=0; i<numberOfcoins; i++){
         if (arr[i] <= sum){
             int sub_res = recursive(arr, numberOfcoins, sum-arr[i]);
             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res){//To avoid Overflow
                res = sub_res + 1;
             }
         }
       }
       return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[] =  new int [n];
       for(int i =0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
       int numberOfcoins = arr.length;
       int sum = sc.nextInt();
       System.out.println(recursive(arr, numberOfcoins, sum) );
    }
}