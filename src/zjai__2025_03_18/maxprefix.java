package zjai__2025_03_18;

//public class maxprefix {
//    public static void main(String[] args) {
//        int [] arr={-1,2,3,-5};
//        int [][]queries={{0,3},{1,3}};
//        int l;
//        int r;
//        for (int [] query:queries) {
//            l = query[0];
//            r = query[1];
//
//            int prefixsum = 0;
//            for (int i = l; i < r; i++) {
//                prefixsum += arr[i];
//            }
//            System.out.println(prefixsum);
//        }
//    }
//}
public class maxprefix {
    public static void main(String[] args) {
        int [] arr={3,1,4,1,5,9};
        int [][]queries={{1,3},{0,2},{2,5}};
        int sum=0;
        for (int [] arr1:queries) {
            int l=arr1[0];
            int r=arr1[1];
            for (int i = l; i <= r; i++) {
                sum+=arr[i];
            }
        System.out.println(sum);
            sum=0;
        }
    }
}
