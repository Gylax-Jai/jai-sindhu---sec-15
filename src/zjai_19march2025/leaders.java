package zjai_19march2025;
//
//public class leaders {
//    public static void main(String[] args) {
////        int arr[] = {10, 5, 8, 2, 4};
//        int arr[] = {109, 205, 8, 2, 4,7};
////        int arr2[] = {};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    System.out.println("leaderfound " + arr[i]);
//
//                }
//                break;
//            }
//        }
//        System.out.println("leaderfound " + arr[arr.length-1]);
//
//    }
//}
public class leaders {
    public static void main(String[] args) {
        int arr[] = {109, 205, 8, 2, 4,7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    System.out.println(arr[i] + " element found");
                }
                break;
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}