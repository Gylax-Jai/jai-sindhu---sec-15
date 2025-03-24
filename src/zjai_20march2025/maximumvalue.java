package zjai_20march2025;

public class maximumvalue {
    public static void main(String[] args) {
        class maxsumsubarray {
            public static void main(String[] args) {
//        int []arr={1,3,2,4};
                int[] arr = {4, -1, -2, 4,5};
                int max = Integer.MIN_VALUE;
                for (int i =0; i<arr.length; i++){
                    int sum=0;
                    for (int j=i;j<arr.length;j++) {
                        sum += arr[j];
                        if (sum < 0) { //reset sum to 0 if negative comes
                            sum = 0;
                        }
                        if (sum > max) {
                            max = sum;
                        }
                    }
                }
                System.out.println(max);
            }
        }

    }
}
