package Array;

public class slidingwindow {
    public static void main(String[] args) {
        int[] a = {2,9,31,-4,21,7};
        int k = 3;
        System.out.println(maxsum(a, k));
    }
    static int maxsum(int[] a, int k){
        int wSum = 0;
        for(int i =0;i<k;i++){
            wSum += a[i];
        }
        int mSum = wSum;
        for(int i = k; i<a.length;i++){
            wSum = wSum - a[i-k] + a[i];
            if(wSum > mSum){
                mSum = wSum;
            }
        }
        return mSum;
    }
}
