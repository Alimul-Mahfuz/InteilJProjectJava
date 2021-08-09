package java_array;
import java.util.Arrays;
public class test_array {
    public static void main(String[] args) {
        int[] arr = {10, 50, 60, 20, 40, 30};
        int[] brr = arr.clone();
        var test=Arrays.equals(arr,brr);
        if(test){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equals");
        }
        Arrays.sort(brr);
        for(int i=0;i<arr.length;i++){
            System.out.println(brr[i]);
        }
        int k = Arrays.binarySearch(arr,50);
        if(k>0){
            System.out.printf("Data found at index: %d \n",k);
        }
        if(k<0){
            System.out.println("Data not found");
        }
        int[] crr = new int[8];
        Arrays.fill(crr,10);
        for (int i:
             crr) {
            System.out.println(i);

        }



    }

}
