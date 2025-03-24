package zjai_20march2025;

public class subarr {
    public static void main(String[] args) {
        int subarr[]={1,3,2,4};
        int n=subarr.length;
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                for (int k=i; k<=j; k++){
                    System.out.print(subarr[k] );

                }
                    System.out.print(" , ");
            }
        }
    }
}
