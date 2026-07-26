package DSA;

public class sliding643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(avg(nums, k));
        
    }
    static double avg(int[] nums, int k){
        int wSum = 0;
        for(int i = 0;i<k;i++){
            wSum += nums[i];
        }
        int mSum = wSum;

        for(int i = k; i<nums.length;i++){
            wSum = wSum - nums[i-k] + nums[i];
            if(wSum > mSum){
                mSum = wSum;
            }
        }
        return (double) mSum / k;
    }
}
