public class LC209 {

    public static void main(String[] args) {
        System.out.println(minSizeSubArray(7, new int[] {2,3,1,2,4,3}));
        System.out.println(minSizeSubArray(4, new int[] {1,4,4}));
        System.out.println(minSizeSubArray(11, new int[] {1,1,1,1,1,1,1,1}));
    }
    //Given an array of positive integers nums and a positive integer target, return the minimal length of a
    //subarray
    // whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
    //
    //
    //
    //Example 1:
    //
    //Input: target = 7, nums = [2,3,1,2,4,3]
    //Output: 2
    //Explanation: The subarray [4,3] has the minimal length under the problem constraint.
    //Example 2:
    //
    //Input: target = 4, nums = [1,4,4]
    //Output: 1
    //Example 3:
    //
    //Input: target = 11, nums = [1,1,1,1,1,1,1,1]
    //Output: 0
    //
    //
    //Constraints:
    //
    //1 <= target <= 109
    //1 <= nums.length <= 105
    //1 <= nums[i] <= 104

    public static int minSizeSubArray(int target, int[] nums){
        int left = 0;
        int check = 0;
        int curr = 0;
        int ans = Integer.MAX_VALUE;

        for(int right = 0;right<nums.length;right++){
            curr += nums[right];
            while(curr>=target){
                check = 1;
                ans = Math.min(ans, right - left + 1);
                curr -= nums[left];
                left++;
            }
        }
        return check > 0 ? ans : 0;
    }
}
