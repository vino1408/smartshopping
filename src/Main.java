import java.util.*;
public class Main{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int []arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length-1;j++){
            int temp= arr[j];
            for(int k=j+1;k<a;k++){
                if(temp<arr[k]){
                    int temp1=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int total=0;
        for(int j=0; j<a ;j++){
            if(j%b==0 && (a-j)>=b){
                continue;
            }
            else{
                total=total+arr[j];
            }
        }
        System.out.println(total);
    }
}