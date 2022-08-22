import java.util.*;
public class Main {
    public static void quicksort(int arr[],int start,int end){
        if(end<=start)
            return;
        int pivot = partition(arr,start,end);
        quicksort(arr,start,pivot-1);//left partition
        quicksort(arr,pivot+1,end);//right partition
    }
    public static int partition(int arr[],int start,int end){//returns the location of pivot
        int pivot = arr[end];
        int i=start-1;
        for(int j=start;j<=end;j++){
            if(arr[j]<pivot){
                i++;
                //all elements less than the pivot are on the left hand side and
                // rest on the right
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;//returns the position of pivot
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Unsorted Array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        quicksort(arr,0,arr.length-1);
        System.out.println("\n"+"Sorted Array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
} 
// moves smaller elements to left of the pivot
//divides the array into 2 partions and pass them recursively
