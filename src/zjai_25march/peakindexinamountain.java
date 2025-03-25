package zjai_25march;

import java.util.Arrays;

public class peakindexinamountain { //   mid pe hi peak niklega hmesha
    public static void main(String[] args) {

            int arr[]={0,3,2,1};
            int peak=-1;

            System.out.println(Arrays.toString(arr));
            int s=0;
            int e=arr.length-1;
            while (s<=e){
                int mid=s+(e-s)/2;
                if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                    peak=mid;
                    break;
                } else if (arr[mid]<arr[mid+1]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        System.out.println(peak);
        }
    }

