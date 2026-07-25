package DSA;

public class missingno {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        
        System.out.println(missingNumber(nums));
        
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length &&   nums[i] != nums[correct]){
                swap(nums, i , correct);
                }else{
                i++;
                }
        }
        // searh for first missing element

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;

    }
        static void swap(int[] nums, int start, int end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    
}

