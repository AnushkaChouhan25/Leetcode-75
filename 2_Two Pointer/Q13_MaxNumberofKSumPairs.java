import java.util.Arrays;

public class Q13_MaxNumberofKSumPairs {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }
    public static int maxOperations(int[] nums, int k) { //O(nlogn)
        int op = 0;
        int left = 0, right = nums.length-1;
        Arrays.sort(nums);
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == k){
                op++;
                left++; right--;
            }
            else if(sum > k){
                right--;
            }else{
                left++;
            }
        }
        return op;
    }
}