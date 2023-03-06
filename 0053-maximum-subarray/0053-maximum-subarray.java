class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int max_till_now = nums[0];
        for(int i = 1; i < nums.length; i++){
            max_till_now = Math.max(max_till_now+nums[i], nums[i]);
            max = Math.max(max_till_now, max);
        }
        return max;
    }
}