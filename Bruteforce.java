import java.util.*;
public class Main {
	public static void brute(int n,int arr[],int sum) {
		int count = 0,temp=sum;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i = 0; i <= n-1; i++){
        while(sum >= arr[i]){
            sum -= arr[i];
            al.add(arr[i]);
            count++;
        }
        if(sum == 0)
            break;

    }
    System.out.println(al);
    System.out.print(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        brute(n,arr,sum);
	}
}
