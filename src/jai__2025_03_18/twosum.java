package jai__2025_03_18;
//import java.util.*;
//public class twosummed {
//    public static void main(String[] args) {
//        int arr[] = {2, 7, 11, 15};
//        int target = 26;
//        int s = 0;
//        int e = arr.length - 1;
//        boolean isfound = false;
//        while (s < e) {
//            if (arr[s] + arr[e] == target) {
//                System.out.println(arr[s] + " " + arr[e]);
//                isfound = true;
//                break;
//            } else if (arr[s] + arr[e] < target) {
//                s++;
//            } else {
//                e--;
//
//            }
//        }
//            if (isfound != true) {
//                System.out.println("targeted elemetns not found");
//            }
//
//        }
//    }
//

//brute-force
class twosum {
        public static void main(String[] args) {

            int[] arr = {2, 7, 9, 13};
            int target = 16;
            boolean aa=false;
            for(int i =0; i<arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("yes");
                        System.out.println("two values is " + arr[i] + " " + arr[j]);
                        System.out.println("two values  index is " + i + " " + j);
                        aa = true;
                    }
//              continue;
                }
            }
            if(aa!=true){
                System.out.println("target not found");
                System.out.println("no");
            }

        }
    }