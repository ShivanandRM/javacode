package Array;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,2};
        insertion1(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void insertion1(int[] arr){
        for(int i = 0; i< arr.length - 1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);

                    // using swap new function make it easier to understand
                    
                    // int temp = arr[j];
                    // arr[j] = arr[j-1];
                    // arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
