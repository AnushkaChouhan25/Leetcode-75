public class Q10_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            }
        }
        public static void moveZeroes(int[] nums) { 
            int left = 0;
            for(int right = 0 ; right< nums.length; right++){
                if(nums[right] != 0){
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                }
            }
        }

}