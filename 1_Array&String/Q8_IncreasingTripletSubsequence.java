public class Q8_IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        // int []arr = {5,4,3,2,1};
        System.out.println(increasingTriplet(arr));
    }
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length < 3 || nums == null) return false;

        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for(int num = 0; num< nums.length; num++){
            if(nums[num] <= i){
                i = nums[num];
            }
            else if(nums[num] <= j){
                j = nums[num];
            }
            else { //if(nums[num] > a && nums[num] > b)
                return true;
            }
        }
        return false;
}
}
