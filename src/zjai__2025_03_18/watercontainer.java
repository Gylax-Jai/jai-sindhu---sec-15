package zjai__2025_03_18;

//brute force
//public class watercontainer {
//    public static void main(String[] args) {
//        int height[]={1,8,6,2,5,4,8,3,7};
//
//        int maxcapacity=0;
//        for(int i=0;i<height.length; i++){ //first line
//            for (int j=i+1; j<height.length; j++){ //second line
//                int minheight=Math.min(height[i],height[j]); // shorter line
//                int width = j-i; //for width increasing with every index
//                int watercapacity=minheight * width;
//
//                maxcapacity=Math.max(watercapacity,maxcapacity);
//            }
//        }
//        System.out.println(maxcapacity);
//
//    }
//}

// now two pointer

public class watercontainer {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};

        int maxcapacity=0;
        int s=0;
        int e=height.length-1;
        while(s<e){
            int minheight=Math.min(height[s],height[e]);
            int width=e-s;
            int capacity=width*minheight;
//            maxcapacity=Math.max(maxcapacity,capacity);
            if(capacity>maxcapacity){
                maxcapacity=capacity;
            }
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        System.out.println(maxcapacity);
    }
}

