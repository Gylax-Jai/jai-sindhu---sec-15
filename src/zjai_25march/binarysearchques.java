package zjai_25march;

import java.util.Arrays;
// first occurecnce and last occurence of target element
public class binarysearchques{
    public static void main(String[] args) {
        int arr[]={0,3,2,1,2};
        int target=2;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int s=0;
        int e=arr.length-1;
//        int [] ans=new int[2];
        int ans=0;
        int ans1=0;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans=mid;
                e=mid-1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
         s=0;
         e=arr.length-1;
        while (s<=e){

            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans1=mid;
                s=mid+1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println(ans);
        System.out.println(ans1);
    }
}
