import java.util.*;
public class rotate_arr {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[],int s,int e){
        int sp=s;
        int ep=e;
        while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
    }
}
