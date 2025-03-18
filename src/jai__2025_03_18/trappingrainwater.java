package jai__2025_03_18;

//public class trappingrainwater {
//    public static void main(String[] args) {
////        int []arr={0,1,0,2,1,0,1,3,2,1,2,1};
//        int []arr={4,2,0,3,2,5};
//        int []left=new int[arr.length];
//        int []right=new int[arr.length];
//            left[0]=0;
//            right[arr.length-1]=0;
//        for (int i=1;i<arr.length;i++){
//            left[i]=Math.max(arr[i-1],left[i-1]);
//        }
//        System.out.println(Arrays.toString(left));
//
//        for (int i=arr.length-2;i>=0;i--){
//            right[i]=Math.max(arr[i+1],right[i+1]);
//        }
//        System.out.println(Arrays.toString(right));
//
//        int waterstore=0;
//
//        for (int currenti=0; currenti<arr.length;currenti++){ // current =i refers to current wall
//            int min_h=Math.min(left[currenti],right[currenti]);
//            if(min_h>arr[currenti]){
//                waterstore +=min_h-arr[currenti];
//            }
//        }
//                System.out.print("water storing ..... " + waterstore + " " );
//    }
//}

public class trappingrainwater {
    public static void main(String[] args) {
        int []height={0,1,0,2,1,0,1,3,2,1,2,1};
        int max=0;
        int index=0;
        int left=-1;
        int waterstore=0;
        int right=-1;
        for (int i=0; i<height.length;i++){
            if(height[i]>max){
                max=height[i];
                index=i;
            }
        }
        for (int ci=0;ci<index;ci++){
            if(height[ci]<left){
                waterstore+=left-height[ci];
            }
            else{
                left=height[ci];
            }
        }
        for (int i=height.length-1; i>index;i--){
            if(height[i]<right){
                waterstore+=right-height[i];
            }
            else{
                right=height[i];
            }
        }
        System.out.println(waterstore);
    }
}

