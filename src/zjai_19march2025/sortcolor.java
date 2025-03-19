package zjai_19march2025;

import java.util.Arrays;

public class  sortcolor {
    public static void main(String[] args) {
        int []arr={2,0,2,1,1,0};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            j++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            j++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
