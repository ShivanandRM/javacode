package basic;

public class maximumno {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6,7,103};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int max = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
