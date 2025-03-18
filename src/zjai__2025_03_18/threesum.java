package zjai__2025_03_18;

import java.util.Arrays;

public class threesum {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-1};
        int target =2;
        boolean found=false;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 2; i++) { // for loop  used for pickup index.

//            if (i > 0 && arr[i] == arr[i - 1])  continue; // for skip duplicates in pickup index
                while(i>=0 && arr[i] == arr[i+1]) i++;
            int s = i + 1;
            int e = arr.length - 1;
            while (s < e) { // while loop for two pointer
                int sum = arr[i] + arr[s] + arr[e];

                if (sum == target) {
                    System.out.println("element found " + arr[i] + " " + arr[s] + " " + arr[e]);
                    found = true;

                    // ✅ Skip duplicate second and third elements
                    while (s < e && arr[s] == arr[s + 1])  s++;
                    while (s < e && arr[e] == arr[e - 1]) e--;

                    s++;
                    e--;
                }
                else if (sum < target) {
                    s++;
                } else {
                    e--;
                }
            }
        }
        if (!found) {
            System.out.println("element not found");
        }
    }
}
