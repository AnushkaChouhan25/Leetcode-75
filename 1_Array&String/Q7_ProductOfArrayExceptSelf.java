public class Q7_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr1[] = {-1,1,0,-3,3};
        int ans[] = productExceptSelf(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int []ans = new int[nums.length];
        for(int i = 0; i < nums.length ; i++){
        int prod = 1;
            for(int j = 0; j< nums.length; j++){
                if(i != j){
                 prod *= nums[j];   
                }
            }
        ans[i] = prod;
        }
        return ans;
    }
}
