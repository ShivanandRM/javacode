package Recursion;

public class Bs {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,18,23,26,45,99,333};
        int target = 2;
        int ans = search(arr, target, 0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr, int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }else{
            return search(arr,target,m+1,e);
        }
    }
}
