import java.util.*;
public class Main {
    public static ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();
    public static  void brute(int chosen[], int arr[],int index, int r, int start, int end) {
        ArrayList <Integer> al= new ArrayList<>();
        if (index == r) {
            for (int i = 0; i < r; i++) {
                al.add(arr[chosen[i]]);
            }
            x.add(al);
            return;
        }
        for (int i = start; i <= end; i++) {
            chosen[index] = i;
            brute(chosen, arr, index + 1,
                    r, i, end);
        }
        return;
    }

    static void repetition(int arr[], int n, int r) {
        int chosen[] = new int[r + 1];
        brute(chosen, arr, 0, r, 0, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int amount = sc.nextInt();
        ArrayList<ArrayList<Integer>>s=new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<=amount;i++){
            repetition(arr, n, i);
        }             
         for(int i=0;i<x.size();i++)
        {
            int sum=0;
            for(int a: x.get(i)) {
                 sum += a;
            }
            if(sum==amount)
            {
                if(s.isEmpty())
                  s.add(x.get(i));
                else{
                    int l=s.get(0).size();
                    int l1=x.get(i).size();
                    if(l>l1)
                    {
                        s.remove(0);
                        s.add(x.get(i));
                    }
                }  
                
            }
        }
          System.out.println("Minimum coins: "+s.get(0).size()); 
        
    }
}