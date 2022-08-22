import java.util.*;
public class Main {
    public static void remove(LinkedList<Character> al,int n){
        int count=1,j=0;
            while(al.size()!=1){
                if(j==al.size()){
                    j=0;
                }
                if(count%5==0 ||count%10==5){
                    al.remove(j);
                    j=j-1;
                }
                count++;
                j+=1;
            }
        System.out.print(al.get(0)); 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Character> al  = new LinkedList<Character>(); 
        for(int i=0;i<n;i++){
            char s=sc.next().charAt(0);
            al.add(s);
        }
        remove(al,n);
    }
} 