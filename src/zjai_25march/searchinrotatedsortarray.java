package zjai_25march;

public class searchinrotatedsortarray { // we can alsosay it like search inn unsorted array
    public static void main(String[] args) {
        int arr[]={5,7,0,1,2,3,4};
        int target=4;
        int n=arr.length;
        int targetindex=-1;
        int e=n-1;
        int s=0;

        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                targetindex=mid;
                break;
            }
            if (arr[s] < arr[mid]) { // if left is sorted\
                if(arr[s]<=target && target<arr[mid]) { // if element in this ranage then  do below
                    e = mid - 1;
                }
                else{
                    s=mid+1; // otherwise do this
                }
            }
            else{ // check in right sorted

            if(arr[mid]<target && target<=arr[e]){ //if element in this range then do below
                s=mid+1;
            }
            else{
                e=mid-1; // othewise do this
            }
            }
        }
        System.out.println(targetindex);
    }
}
