class Solution {
    public int rob(int[] nums) {
        
     /*   int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<n ;i++){ 
            dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
        }
        return Math.max(dp[n-1], dp[n-2]);*/

        int n = nums.length;
        int prev2 = 0, prev1 = 0;
        for(int x : nums){
            int curr = Math.max(x+ prev2, prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
