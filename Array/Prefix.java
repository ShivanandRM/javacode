package Array;

public class Prefix {
    public static void main(String[] args) {
        int[] nums = {1,-1,0,1,2,-1,3};
        int k =3;
        System.out.println(ksum(nums, k));
    }
    static int ksum(int[] nums, int k){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
