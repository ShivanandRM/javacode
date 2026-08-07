package pattern;

public class Slidingwindow {
    public static void main(String[] args) {
        // print the longest subarray with sum <=14
        int[] arr = {2,5,1,7,10};
        int k = 14;
        System.out.println(slid(arr, k));
    }
    static int slid(int[] arr, int k){
        int l=0;
        int sum=0;
        int maxl=0;

        for(int r=0;r<arr.length;r++){
            sum += arr[r];

            while(sum>k){
                sum = sum  - arr[l];
                l++;
            }
            maxl = Math.max(maxl, r-l+1);
        }
        return maxl;
    }
}
